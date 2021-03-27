package net.sinzi.mini.controller;

import java.io.File;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import net.sinzi.mini.model.Picture;
import net.sinzi.mini.model.User;
import net.sinzi.mini.model.UserAndPicture;
import net.sinzi.mini.service.PictureService;
import net.sinzi.mini.service.UserService;
import net.sinzi.mini.util.UploadFileUtils;

@Controller
public class UserController {
	
	@Autowired
	UserService uservice;
	
	@Autowired
	PictureService pservice;
	
	@Resource(name="uploadPath")
	private String uploadPath;
	
	//환영페이지
	@RequestMapping("/")
	public String getWelcome() {
		
		return "welcome";
	}
	//로그인 or 회원가입
	@RequestMapping("/beforeLogin")
	public String showBeforeLogin() {
		
		return "beforeLogin";
	}
	
	//회원가입 폼 보여주기
	@RequestMapping("/getRegister")
	public ModelAndView getRegister() {
		
		ModelAndView mav = new ModelAndView("registerForm");
		mav.addObject("user", new User());
		
		return mav;
	}
	
	//회원가입 폼 받아오기
	@RequestMapping("/postRegister")
	public String postRegister(@ModelAttribute("user")User user) throws Exception {
//		System.out.println(user.toString());
		//service에 값 전달하기...
		uservice.register(user);
		return "beforeLogin";
	}
	
	//로그인 폼 보여주기
	@RequestMapping("/getLogin")
	public ModelAndView getLogin() {
		
		ModelAndView mav = new ModelAndView("loginForm");
		mav.addObject("user",new User());
		
		return mav;
	}
	
	//로그인 처리
	@RequestMapping("/processLogin")
	public ModelAndView postLogin(@ModelAttribute("user")User user,HttpServletRequest req,HttpSession session,Model model) throws Exception {

		User login = uservice.login(user);
		//쿼리문에서 가져오는 값이 없으면 로그인 폼에서 안 넘어가고
		if(login==null) {
			
			ModelAndView mav = new ModelAndView("loginForm");
			
			return mav;
			
			//쿼리문에서 가져오는 값이 있으면 index로 넘어간다.	
		}else {
			model.addAttribute(login);
			session.setAttribute("user", login);
			ModelAndView mav = new ModelAndView("index");
			return mav;
		}
	}
	
	//등록한 리뷰 가져오기
	@RequestMapping("/myReview")
	public ModelAndView myreview(HttpServletRequest req,HttpSession session) throws Exception {
		//session받아왔음
		User user = (User)session.getAttribute("user");
		user.toString();
		System.out.println("user :" + user.toString());
		
		UserAndPicture userAndPicture = pservice.showGallery(user);
		ModelAndView mav = new ModelAndView("myReviewPage");
		mav.addObject("pictureList", userAndPicture);
		System.out.println("showG : " + pservice.showGallery(user));
		return mav;
	}
	
	//로그아웃
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {
		session.invalidate();
		return "beforeLogin";
	}
	
	//썸네일 등록 폼 보여주기
	@RequestMapping("/getNewPicture")
	public ModelAndView getNewPicture() throws Exception {
		
		ModelAndView mav = new ModelAndView("createPicture");
		mav.addObject("picture", new Picture());
		
		return mav;
	}
	
	//썸네일 등록 폼 받아오기
	@RequestMapping("/createNewPicture")
	public ModelAndView createNewPicture(@ModelAttribute("Picture")Picture picture,MultipartFile file, HttpSession session) throws Exception {
//		System.out.println(session);
//		System.out.println(file);
		String imgUploadPath = uploadPath + File.separator + "imgUpload";
		String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
		String fileName = null;

		if(file != null) {
		 fileName =  UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath); 
		} else {
		 fileName = uploadPath + File.separator + "images" + File.separator + "none.png";
		}

		picture.setMovieImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
		picture.setThumbImg(File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
				
//		System.out.println(picture.toString());
		pservice.register(picture);
		
		ModelAndView mav = new ModelAndView("redirect:/myReview");
		
		return mav;
	}
}














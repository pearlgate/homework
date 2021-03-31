package net.sinzi.mini.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.management.RuntimeErrorException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public ModelAndView postRegister(@ModelAttribute("user")User user) throws Exception {
		System.out.println(user);		
		int result = uservice.idChk(user);
		try {
			if(result==1) {
				ModelAndView mav = new ModelAndView("registerForm");
				return mav;
			}else if(result == 0) {
				uservice.register(user);
			}
		}catch(Exception e) {
			throw new RuntimeException();
		}		
		ModelAndView mav = new ModelAndView("loginForm");
		return mav;
		
		
//		//service에 값 전달하기...			
//		uservice.register(user);
//		ModelAndView mav = new ModelAndView("loginForm");
//
//		return mav;
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
		System.out.println(uservice.login(user));
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
	//등록한 리뷰 가져오기
	@RequestMapping("/myReview")
	public ModelAndView myreview(HttpServletRequest req,HttpSession session) throws Exception {
		//session받아왔음
		User user = (User)session.getAttribute("user");
		user.toString();
//		System.out.println("user :" + user.toString());
		
		UserAndPicture userAndPicture = pservice.showGallery(user);
		ModelAndView mav = new ModelAndView("myReviewPage");
		mav.addObject("pictureList", userAndPicture);
//		System.out.println("showG : " + pservice.showGallery(user));
		return mav;
	}
	
	//리뷰 조회하기
	@RequestMapping("/detailReview")
	public ModelAndView detailReview(Picture picture) {
		//detailReview페이지에 detail키로 service로 받아온 객체 넘김.
		ModelAndView mav = new ModelAndView("detailReview");
		mav.addObject("detail", pservice.showDetail(picture.getId()));
//		System.out.println("detail :" + pservice.showDetail(picture.getId()));
		
		return mav;
	}
	
	//리뷰 삭제하기
	@RequestMapping("/deleteReview")
	public ModelAndView deleteReview(@RequestParam("id") int id) {
		ModelAndView mav = new ModelAndView("redirect:/myReview");
		pservice.delete(id);
		return mav;
	}
	
	//리뷰 수정폼 보여주기
	@RequestMapping("/getUpdate")
	public ModelAndView getUpdate(@ModelAttribute("picture")Picture picture) {
		
		System.out.println("detail에서 넘어온 id "+picture.getId());
		
		ModelAndView mav = new ModelAndView("updateForm");
		mav.addObject("doUpdate", pservice.showDetail(picture.getId()));
		
		return mav;
	}
	
	//리뷰 수정폼 처리하기
	@RequestMapping("/processUpdate")
	public ModelAndView processUpdate(Picture picture,MultipartFile file, HttpServletRequest req) throws IOException, Exception {
//		  System.out.println("p : " + picture);
//		  System.out.println("preq : " + req.getParameter("movieImg"));
		  if(file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
			  // 기존 파일을 삭제
			  new File(uploadPath + req.getParameter("movieImg")).delete();
			  new File(uploadPath + req.getParameter("thumbImg")).delete();
			  
			  // 새로 첨부한 파일을 등록
			  String imgUploadPath = uploadPath + File.separator + "imgUpload";
			  String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
			  String fileName = UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);
			  
			  picture.setMovieImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
			  picture.setThumbImg(File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
			  
			 } else {  // 새로운 파일이 등록되지 않았다면
			  // 기존 이미지를 그대로 사용
			  picture.setMovieImg(req.getParameter("movieImg"));
			  picture.setThumbImg(req.getParameter("thumbImg"));
			  
			 }
		  pservice.update(picture);
//		  System.out.println(picture);
		  ModelAndView mav = new ModelAndView("redirect:/myReview");
		
		return mav;
	}
	
	//아이디 중복 체크
	@ResponseBody
	@RequestMapping("/idChk")
	public int idChk(User user) {
		System.out.println(user);
		int result = uservice.idChk(user);
		System.out.println(result);
		return result;
	}
}




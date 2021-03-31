package net.sinzi.mini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sinzi.mini.dao.UserDao;
import net.sinzi.mini.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao dao; 
	
	//회원가입
	@Override
	public void register(User user) throws Exception{
		
		dao.register(user);
		
	}
	
	//로그인
	@Override
	public User login(User user) throws Exception {
		
		return dao.login(user);
	}
	
	//회원가입시 id중복체크
	@Override
	public int idChk(User user) {
		
		return dao.idChk(user);
	}
	
}








package net.sinzi.mini.dao;

import net.sinzi.mini.model.User;

public interface UserDao {
	
	//회원가입
	public void register(User user) throws Exception;
	
	//로그인
	public User login(User user) throws Exception;
	
	//회원가입시 id 중복체크
	public int idChk(User user);
	
}

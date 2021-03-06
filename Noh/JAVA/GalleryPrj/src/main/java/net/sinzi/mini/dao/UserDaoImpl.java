package net.sinzi.mini.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import net.sinzi.mini.model.User;
import net.sinzi.mini.util.MybatisUtil;

@Repository
public class UserDaoImpl implements UserDao {
		
	SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
	
	//회원가입
	@Override
	public void register(User user) throws Exception {
		session.insert("register", user);
		session.commit();
	}
	
	//로그인
	@Override
	public User login(User user) throws Exception {
		
		return session.selectOne("login", user);
		
	}
	
	//회원가입시 id중복체크
	@Override
	public int idChk(User user) {
		
		return session.selectOne("idChk", user);
	}
	
	
}

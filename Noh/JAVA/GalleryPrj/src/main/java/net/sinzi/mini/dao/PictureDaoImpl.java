package net.sinzi.mini.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import net.sinzi.mini.model.Picture;
import net.sinzi.mini.model.User;
import net.sinzi.mini.model.UserAndPicture;
import net.sinzi.mini.util.MybatisUtil;

@Repository
public class PictureDaoImpl implements PictureDao {
	
	SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
	
	//썸네일보기
	@Override
	public UserAndPicture showGallery(User user) {
		
		UserAndPicture userAndPicture = session.selectOne("galleryList", user);
		System.out.println(user.getId());
		session.commit();
		
		return userAndPicture;
	}
	
	//썸네일등록
	@Override
	public void register(Picture picture) {
		
		session.insert("insert",picture);
		session.commit();
		
	}

}

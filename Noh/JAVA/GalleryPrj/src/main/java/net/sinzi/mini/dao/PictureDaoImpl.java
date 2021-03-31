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
	
	//리뷰 보기
	@Override
	public UserAndPicture showGallery(User user) {
		
		UserAndPicture userAndPicture = session.selectOne("galleryList", user);
		session.commit();
		
		return userAndPicture;
	}
	
	//리뷰 등록
	@Override
	public void register(Picture picture) {
		
		session.insert("insert",picture);
		session.commit();
		
	}
	
	//리뷰 자세히 보기
	@Override
	public Picture showDetail(int id) {
		
		Picture picture = session.selectOne("detailReview", id);
		session.commit();
		return picture;
	}
	
	//리뷰 삭제
	@Override
	public void delete(int id) {
		session.delete("delete",id);
		session.commit();
		
	}
	
	//리뷰 수정
	@Override
	public void update(Picture picture) {
		session.update("update", picture);
		session.commit();
		
	}
	
}

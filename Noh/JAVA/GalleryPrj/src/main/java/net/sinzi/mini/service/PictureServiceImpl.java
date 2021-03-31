package net.sinzi.mini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sinzi.mini.dao.PictureDao;
import net.sinzi.mini.model.Picture;
import net.sinzi.mini.model.User;
import net.sinzi.mini.model.UserAndPicture;

@Service
public class PictureServiceImpl implements PictureService {
	
	@Autowired
	PictureDao dao;
	
	//리뷰 보기
	@Override
	public UserAndPicture showGallery(User user) {
		
		return dao.showGallery(user);
	}
	
	//리뷰 등록
	@Override
	public void register(Picture picture) throws Exception {
		
		dao.register(picture);
	}
	
	//리뷰 자세히 보기
	@Override
	public Picture showDetail(int id) {
		
		return dao.showDetail(id);
	}
	
	//리뷰 삭제하기
	@Override
	public void delete(int id) {
		dao.delete(id);
	}
	
	//리뷰 수정하기
	@Override
	public void update(Picture picture) {
		dao.update(picture);		
	}
	
}

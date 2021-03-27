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
	
	//썸네일 보기
	@Override
	public UserAndPicture showGallery(User user) {
		
		return dao.showGallery(user);
	}
	
	//썸네일 등록
	@Override
	public void register(Picture picture) throws Exception {
		
		dao.register(picture);
	}
	
}

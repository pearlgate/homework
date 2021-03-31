package net.sinzi.mini.service;

import net.sinzi.mini.model.Picture;
import net.sinzi.mini.model.User;
import net.sinzi.mini.model.UserAndPicture;

public interface PictureService {
	// 리뷰 등록
	public void register(Picture picture) throws Exception;

	// 리뷰 보기
	public UserAndPicture showGallery(User user);
	
	// 리뷰 자세히 보기
	public Picture showDetail(int id);
	
	//리뷰 삭제하기
	public void delete(int id);
	
	//리뷰 수정하기
	public void update(Picture picture);

}

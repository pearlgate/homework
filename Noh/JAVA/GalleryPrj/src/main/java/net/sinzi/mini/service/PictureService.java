package net.sinzi.mini.service;

import net.sinzi.mini.model.Picture;
import net.sinzi.mini.model.User;
import net.sinzi.mini.model.UserAndPicture;

public interface PictureService {
	// 썸네일 등록
	public void register(Picture picture) throws Exception;

	// 썸네일 보기
	public UserAndPicture showGallery(User user);

}

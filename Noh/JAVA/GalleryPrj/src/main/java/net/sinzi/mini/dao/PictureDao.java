package net.sinzi.mini.dao;

import net.sinzi.mini.model.Picture;
import net.sinzi.mini.model.User;
import net.sinzi.mini.model.UserAndPicture;

public interface PictureDao {

	// 썸네일 등록
	public void register(Picture picture);

	// 썸네일보기
	public UserAndPicture showGallery(User user);

}

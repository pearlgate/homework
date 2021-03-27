package net.sinzi.mini.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Picture {
	private int id;
	private String user_id;
	private String title;
	private String coment;
	private Date regDate;
	private String movieImg;
	private String thumbImg;
	
	public Picture() {
		
	}

	public Picture(int id, String user_id, String title, String coment, Date regDate, String movieImg, String thumbImg) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.title = title;
		this.coment = coment;
		this.regDate = regDate;
		this.movieImg = movieImg;
		this.thumbImg = thumbImg;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getMovieImg() {
		return movieImg;
	}

	public void setMovieImg(String movieImg) {
		this.movieImg = movieImg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getThumbImg() {
		return thumbImg;
	}

	public void setThumbImg(String thumbImg) {
		this.thumbImg = thumbImg;
	}

	@Override
	public String toString() {
		return "Picture [id=" + id + ", user_id=" + user_id + ", title=" + title + ", coment=" + coment + ", regDate="
				+ regDate + ", movieImg=" + movieImg + ", thumbImg=" + thumbImg + "]";
	}

}

package net.sinzi.mini.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserAndPicture {
	private int id;
	private String name;
	
	private List<Picture> picture;

	public UserAndPicture() {

	}

	public UserAndPicture(int id, String name, List<Picture> picture) {
		this.id = id;
		this.name = name;
		this.picture = picture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Picture> getPicture() {
		return picture;
	}

	public void setPicture(List<Picture> picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "UserAndPicture [id=" + id + ", name=" + name + ", picture=" + picture + "]";
	}

}

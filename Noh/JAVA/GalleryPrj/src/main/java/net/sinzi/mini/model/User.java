package net.sinzi.mini.model;

import org.springframework.stereotype.Component;

@Component
public class User {
	private int id;
	private String nickName;
	private String email;
	private String password;
	
	public User() {
		
	}

	public User(int id, String nickName, String email, String password) {
		this.id = id;
		this.nickName = nickName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nickName=" + nickName + ", email=" + email + ", password=" + password + "]";
	}
	
}

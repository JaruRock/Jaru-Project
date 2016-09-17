package th.co.tac.kms.web.dao.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 3110438254016956241L;

	private Integer userId;
	private String username;
	private String password;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

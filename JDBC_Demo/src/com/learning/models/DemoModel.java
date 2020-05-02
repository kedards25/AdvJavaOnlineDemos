package com.learning.models;

public class DemoModel {

	private int id;
	private String userName;
	private String userPwd;
	
	public DemoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemoModel(int id, String userName, String userPwd) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPwd = userPwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Override
	public String toString() {
		return "DemoModel [id=" + id + ", userName=" + userName + ", userPwd=" + userPwd + "]";
	}
	
	
	
}

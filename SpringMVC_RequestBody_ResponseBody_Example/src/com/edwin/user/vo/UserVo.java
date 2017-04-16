package com.edwin.user.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserVo {
	private int userID;
	private String userName;
	private String password;
	private String phone;
	private String email;
	private Date birthday;
	private int gender;
	
	public UserVo(){
		
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//表单提交的数据，转换成bean
	@DateTimeFormat(pattern="yyyy-MM-dd")
	// JSON转换格式设置日期
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return this.getUserID()+"  "+this.getUserName()+"  "+this.getBirthday()+"...";
	}
}

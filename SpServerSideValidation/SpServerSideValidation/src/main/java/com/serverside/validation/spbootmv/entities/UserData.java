package com.serverside.validation.spbootmv.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserData {
	@NotBlank(message = "User Name can not be empty !!")
	@Size(min = 3, max =12, message ="User name must be between 3 - 12 characters")
	private String userName;
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email !!")
	private String email;
	
	@AssertTrue(message = "Must agree terms and conditions")
	private boolean agreed;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	@Override
	public String toString() {
		return "UserData [userName=" + userName + ", email=" + email + "]";
	}
	

}

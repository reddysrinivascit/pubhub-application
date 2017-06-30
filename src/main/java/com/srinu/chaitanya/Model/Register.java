package com.srinu.chaitanya.Model;

import javax.persistence.Entity;

@Entity

public class Register {
private String name;
private String username;
private String passward;
private int mobile_no;
private int email_id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassward() {
	return passward;
}
public void setPassward(String passward) {
	this.passward = passward;
}
public int getMobile_no() {
	return mobile_no;
}
public void setMobile_no(int mobile_no) {
	this.mobile_no = mobile_no;
}
public int getEmail_id() {
	return email_id;
}
public void setEmail_id(int email_id) {
	this.email_id = email_id;
}
}

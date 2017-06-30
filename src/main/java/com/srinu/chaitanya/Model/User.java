package com.srinu.chaitanya.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "passward")
	private String passward;
	
	@Column(name = "mobile_no")
	private int mobile_no;
	
	@Column(name = "email_id")
	private String email_id;
	
	@Column(name = "active")
	private String active;
	
	@Column(name = "role")
	private String role;
	
	public User(){
		
	}
	
	public User(int id, String name, String username, String passward, int mobile_no, String email_id, String active,
			String role) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.passward = passward;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.active = active;
		this.role = role;
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

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}

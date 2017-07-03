package com.srinu.chaitanya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

		@Id
		@GeneratedValue
		@Column(name = "id")
		private int id;

		@Column(name = "name")
		private String name;

		@Column(name = "username")
		private String username;
		
		@Column(name = "password")
		private String password;
		
		@Column(name = "mobile_no")
		private String mobileNumber;
		
		@Column(name = "email_id")
		private String email;

		@Column(name="active")
		private String active;
		
		@ManyToOne
		@JoinColumn(name="user_role_id")
		private Role role;

		public User(){
			
		}
		
		public User(String name, String username, String password, String mobileNumber, String emailID) {
			this.name = name;
			this.username = username;
			this.password = password;
			this.mobileNumber = mobileNumber;
			this.email = emailID;
			this.active = "A";
		}
}

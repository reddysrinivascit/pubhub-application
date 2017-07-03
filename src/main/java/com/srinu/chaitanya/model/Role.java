package com.srinu.chaitanya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "roles")

public class Role {
	
	@Id
	@GeneratedValue
	@Column(name = "role_id")
	private int roleId;

	@Column(name = "name")
	private String roleName;
}

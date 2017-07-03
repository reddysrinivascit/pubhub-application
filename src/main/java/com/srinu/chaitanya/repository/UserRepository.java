package com.srinu.chaitanya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.srinu.chaitanya.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "select * from users where username=?1 and password=?2 and active=?3", nativeQuery = true)
	public User findByUserNameAndPassword(String userName, String password, char active);
	
	@Query(value = "select * from users where username=?1", nativeQuery = true)
	public User findByUserName(String userName);
	
	@Query(value = "update users set password = ?1 where username = ?2 and active = ?3", nativeQuery = true)
	public User updatePassword(String newPassword, String username, char active);
}
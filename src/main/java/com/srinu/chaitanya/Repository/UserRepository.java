package com.srinu.chaitanya.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.srinu.chaitanya.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value = "select * from user where username=?1 and passward=?2 and active=?3", nativeQuery = true)
	public User findByUserNameAndPassward(String username, String passward, char active);
}
 
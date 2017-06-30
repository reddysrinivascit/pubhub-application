package com.srinu.chaitanya.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.chaitanya.Model.User;
import com.srinu.chaitanya.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository userRepository;

	public User findByUserNameAndPassward(String username, String passward) {
		return userRepository.findByUserNameAndPassward(username, passward, 'a');
		}
	public User userRegister(User user){
		return userRepository.save(user);
	}
	
}

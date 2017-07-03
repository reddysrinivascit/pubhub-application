package com.srinu.chaitanya.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srinu.chaitanya.model.User;
import com.srinu.chaitanya.service.UserService;


@Controller
@RequestMapping("auth")
public class AuthenticationController {
	
	private static final Logger LOGGER = Logger.getLogger(AuthenticationController.class);

	@Autowired
	private UserService userService;

	@GetMapping
	public String login(){
	return "user/login";	
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
		LOGGER.info("Entering Login " + username + "-" + password);

		User user = userService.findByUserNameAndPassword(username, password);
		LOGGER.info("User:" + user);
		
		if (user != null) {
			session.setAttribute("USER_LOGGED", user);
			LOGGER.info("Login Success");
			return "redirect:../book";
		} else {
			LOGGER.error("Login Failure");
			return "user/login";
		}
	}

	@GetMapping("/register")
	public String register() {
		return "user/register";
	}

	@PostMapping("/register")
	public String register(@RequestParam("name") String name, @RequestParam("username") String username,
			@RequestParam("password") String password, @RequestParam("mobileNumber") String mobileNumber,
			@RequestParam("emailID") String emailID, @RequestParam("roleID") String roleID) {

		User user = new User(name, username, password, mobileNumber, emailID);
		userService.register(user);
		return "redirect:../";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
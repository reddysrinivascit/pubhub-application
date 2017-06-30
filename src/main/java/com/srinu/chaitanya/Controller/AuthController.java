package com.srinu.chaitanya.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srinu.chaitanya.Model.User;
import com.srinu.chaitanya.Service.UserService;

@Controller
@RequestMapping("auth")

public class AuthController {
	
	@Autowired
	public UserService userService;
	@GetMapping
	public String home(){
		return "home";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("username") String username,@RequestParam("password")String passward){
		User user =userService.findByUserNameAndPassward(username ,passward);
	if(user!=null)
	{
		System.out.println("logged in successfully");
	return "redirect:../book/list";
	}
	else{
		System.out.println("failure");
		return "home";
	}
	}
	@GetMapping("/Register")
	public String showRegister(){
		return "User/Register"; 
		}
	
	@GetMapping("/adduser")
	public String Register( @RequestParam("id")int id,
			@RequestParam("name")String name,
			@RequestParam("username") String username,
			@RequestParam("passward")String passward,
			@RequestParam ("mobile_no") int mobile_no,
			@RequestParam("email_id") String email_id,
			@RequestParam("active")String active,
		    @RequestParam("role")String role){
	User user =new User(id,name,username,passward,mobile_no,email_id,active,role);
	userService.userRegister(user);
	return "User/registered";
	}
	}

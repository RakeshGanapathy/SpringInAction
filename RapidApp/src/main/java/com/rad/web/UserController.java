package com.rad.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rad.User;

@Controller
public class UserController {
	@GetMapping("user")
	@ResponseBody
	public User userDataPopulate(User user) {
		return user;
	}

}

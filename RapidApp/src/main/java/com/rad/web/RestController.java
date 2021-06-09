package com.rad.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rad.Student;

@Controller
public class RestController {
	@RequestMapping("home")
	@ResponseBody
	public Student home() {
		System.out.println("hey Rakesh");
		return new Student();
	}
}

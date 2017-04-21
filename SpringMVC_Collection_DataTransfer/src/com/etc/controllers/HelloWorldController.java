package com.etc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.etc.model.UserListForm;

@Controller
@RequestMapping("/dept/")
public class HelloWorldController {
	@RequestMapping("index.action")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		return mav;
	}

	@RequestMapping("hello.action")
	public String hello(UserListForm userListForm) {
		return "hello";
	}

}

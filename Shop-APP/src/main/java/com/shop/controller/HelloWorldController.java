package com.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.service.HelloWorldService;

@Controller
public class HelloWorldController {
	
	@Autowired
	HelloWorldService helloWorldService;
	
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "HELLO SPRING MVC HOW R U";
		return new ModelAndView("hello", "message", message);
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request,HttpServletResponse res) {
		 String name=request.getParameter("name"); 
		String pass=request.getParameter("password");
		 
		 helloWorldService.save(name,pass);
		 return new ModelAndView("print", "name",name );
	}
}
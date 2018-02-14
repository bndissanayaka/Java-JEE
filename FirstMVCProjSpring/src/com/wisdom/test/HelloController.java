package com.wisdom.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	@RequestMapping("/")
	protected ModelAndView handleRequest() {
	  ModelAndView model = new ModelAndView("Hello");
	  model.addObject("msg", "Welcome to my first page");
	  
		return model;
	}

	
}

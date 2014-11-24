package com.draka.pract.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class MainController {
	String message = "Spring MVC is working fine!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Unknown") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("AddFile");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}
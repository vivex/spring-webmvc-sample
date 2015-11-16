package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.UserRepository;

@Controller
@RequestMapping("/")
public class HelloController {
	//@Autowired
	//UserRepository userRepository;

	@RequestMapping(value="",method = RequestMethod.GET)
	@ResponseBody
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}
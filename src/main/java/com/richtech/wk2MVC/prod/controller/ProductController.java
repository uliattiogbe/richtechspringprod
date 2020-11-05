package com.richtech.wk2MVC.prod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/")
	public String welcome(Model model)
	{
		model.addAttribute("message1","hello I am a controller messager");
		
		return "index";
		
	}

}
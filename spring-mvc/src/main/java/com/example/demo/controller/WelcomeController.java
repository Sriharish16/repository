package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/mvc")
public class WelcomeController {
	@RequestMapping(value="/greet",method=RequestMethod.GET)
	@ResponseBody
	public String getMessage()
	{
		return "<h1 style='text-align:center'>Welcome to Supplex City</h1>";
	}
	

	@RequestMapping(value="/bye",method=RequestMethod.GET)
	@ResponseBody
	public String getMessage1() {
		return "<h6 style='text-align:center'>"
				+ "designed by suba </h6>";
	}
	

}

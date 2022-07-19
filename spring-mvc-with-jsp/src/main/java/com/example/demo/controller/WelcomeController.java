package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepositry;




@RequestMapping("/mvc")
@Controller
public class WelcomeController {
	private ModelAndView  mdlView;
	
	private ProductRepositry repo;
	

@Autowired
	public WelcomeController(ModelAndView mdlView,ProductRepositry repo) {
		super();
		this.mdlView = mdlView;
		this.repo=repo;
	}



	@RequestMapping(value="/first",method=RequestMethod.GET)
	
	public String getMessage()
	{
	return "welcome";
	}
	
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
		
	public ModelAndView getHomePage()
		{
		List<Product>prdList=repo.findAll();
	mdlView.addObject("list",prdList);
	mdlView.setViewName("home");
	return mdlView;	}
}

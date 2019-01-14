package net.cls.onlineshopping.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.cls.shoppingbackend.dao.CategoryDAO;

@Controller
public class PageController {

	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to sping web MVC");
		mv.addObject("title", "Home");
		//PASSING THE list of categories
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to sping web MVC");
		mv.addObject("title", "About us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv=new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to sping web MVC");
		mv.addObject("title", "contact us");
		mv.addObject("userClickcontact", true);
		return mv;
	}
	
	@RequestMapping(value= {"/show/all/products"})
	public ModelAndView showAllProducts() {
		ModelAndView mv=new ModelAndView("page");
		//mv.addObject("greeting", "Welcome to sping web MVC");
		mv.addObject("title", "All Products");
		mv.addObject("userClickAllProduct", true);
		return mv;
	}
	
//	@RequestMapping(value= {"/test/{greeting}"})
//	public ModelAndView test(@PathVariable("greeting")String greeting) {
//		
//		if (greeting==null) {
//			greeting="hello there";
//		}
//		
//		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
	
//	@RequestMapping(value= {"/test"})
//	public ModelAndView test(@RequestParam(name="greeting",required=false)String greeting) {
//		
//		if (greeting==null) {
//			greeting="hello there";
//		}
//		
//		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
	
	
	
}

package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.demo.service.BooklistService;

@Controller
public class BooklistController {
	@Autowired
	BooklistService booklistService;
	
	@RequestMapping("showbooks")
	public ModelAndView showBooks() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("bllist",booklistService.showAllBooks());
		mav.setViewName("booklistForm");
		
		return mav;
	}
	
	@RequestMapping("booklistDetail")
	public ModelAndView bookDetail(@RequestParam String bid) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("bdetail",booklistService.showBookDetail(bid));
		mav.setViewName("bookDetailForm");
		
		return mav;
	}
	
	@RequestMapping(value="showbyCat", method=RequestMethod.GET)
	public ModelAndView showBooksByCat(@RequestParam String bcategory) {
		ModelAndView mav = new ModelAndView();
		System.out.println("controller : "+bcategory);
		mav.addObject("blist",booklistService.showBooksByCat(bcategory));
		mav.setViewName("showCatsBooks");
		
		return mav;
	}
}

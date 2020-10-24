package com.nt.ssit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;



public class WishController  implements Controller{
	@Override

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		return new ModelAndView("wish","status","Good Evening");
	}
	
	
	

}

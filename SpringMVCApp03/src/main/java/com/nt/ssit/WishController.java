package com.nt.ssit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("msg")
@Controller
public class WishController {
	
	@RequestMapping("/wish")
	
	//@ModelAttribute("msg")
	
	public String WishMessage(Model model)
	{
		String str="Good Evening";
		model.addAttribute("msg",str);
		return "wish";
		
	}

}

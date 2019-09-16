package com.HappiestMinds.Persistent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	@Autowired
	WordsAdd wa;
		
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
}

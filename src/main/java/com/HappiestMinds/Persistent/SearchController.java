package com.HappiestMinds.Persistent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

	@Autowired
	WordsAdd wa;

	@RequestMapping("search")
	public ModelAndView getResult(@RequestParam String wrd)
	{
		ModelAndView mv=new ModelAndView("result.jsp");
		
		if(wrd.isEmpty())
			mv.addObject("res","oops!! blank box searched!!!!");
		else
		if(!wa.existsByWrd(wrd))
			mv.addObject("res", "Not Found in Dictionary");
		else
			mv.addObject("res", "Found in Dictionary");
			
			
		return mv;
	}
}

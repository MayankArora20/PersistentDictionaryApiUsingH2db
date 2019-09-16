package com.HappiestMinds.Persistent;

import java.io.IOException;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UploadController 
{

	@Autowired
	WordsAdd wa;
	
	@PostMapping("/upload") 
	 public ModelAndView singleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes)
	 {
		 ModelAndView mv=new ModelAndView("uploadStatus.jsp");
			
	        if (file.isEmpty()) {;
	            mv.addObject("message", "Please select a file to upload");
	            return mv;
	        }

	        String ext=file.getOriginalFilename().split("\\.")[1];
	        
	        if(!ext.contentEquals("txt"))
	        	mv.addObject("message","Please Upload txt File!!!");
	        else
	        {
		        try {
		        	String s=new String(file.getBytes(), "UTF-8");
		        	StringTokenizer st=new StringTokenizer(s," \t\n\r\f,.:;?![]'");
		        	while(st.hasMoreTokens())
		        	{
		        	String k=st.nextToken();
		        	if(!wa.existsByWrd(k))
		        		{
		        		  Word x=new Word();
		        		  x.setWrd(k);
		        		  wa.save(x);
		        		}
		        	}
		            mv.addObject("message","You successfully uploaded");
	
		        } 
		        catch (IOException e) {
		            e.printStackTrace();
		        }
	        }
	        return mv;
	}

}

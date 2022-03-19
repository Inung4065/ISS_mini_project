package com.spring.issmini;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dto.AccDto;
import com.spring.service.signUpService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SignUpController {
	private static final Logger logger = LoggerFactory.getLogger(SignUpController.class);
	
	@Autowired
	signUpService singupservice;
	
	
	@RequestMapping(value="i0002")
	public String viewPage() {
		return "i0002";
	}
	@RequestMapping(value = "/i0002", method = RequestMethod.POST)
	public String postsignup(AccDto acc) throws Exception {
		singupservice.accountAdd(acc);
		logger.info("user sign up!");
	 
		return "redirect:/";
	}
}

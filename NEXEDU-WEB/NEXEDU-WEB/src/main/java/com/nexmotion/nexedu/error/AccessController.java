package com.nexmotion.nexedu.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccessController {
		
	@RequestMapping("/error/denied")
	public String errorAccessDenied() {
		return "/error/denied";
	}

}

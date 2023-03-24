package com.nexmotion.nexedu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestContoller {
	
	@RequestMapping("/test")
	public String test() throws Exception {
		return "test/test";
	}

}
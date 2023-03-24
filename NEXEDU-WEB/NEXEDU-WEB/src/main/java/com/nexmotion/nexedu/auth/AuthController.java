package com.nexmotion.nexedu.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

	/**
	 * 로그인 아이디와 비밀번호를 입력하는 페이지
	 * @return
	 */	 
	@RequestMapping("/auth/login")
	public String authLogin() {		
		return "/auth/login";
	}

	
}
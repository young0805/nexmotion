package com.nexmotion.nexedu.account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;

public class AccountSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	private RequestCache requestCache = new HttpSessionRequestCache();
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	/**
	 * SimpleUrlAuthenticationSuccessHandler 에서 구현한 onAuthenticationSuccess 를 재정의.
	 * 로그인 성공 시, 인증 받기전 url 이 있을 경우 해당 url 로 이동하며, 
	 * 만약 인증 받기전 url 이 없을 경우 SecurityConfig 에서 지정한 defaultSuccessUrl 로 이동한다.
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
		System.err.println("onAuthenticationSuccess call");
		SavedRequest savedRequest = requestCache.getRequest(request, response);

		if (savedRequest != null) {
			// 인증 받기 전 url로 이동하기
			String targetUrl = savedRequest.getRedirectUrl();
			redirectStrategy.sendRedirect(request, response, targetUrl);
			return;
		}

		// 기본 url로 가도록 함함
		// getDefaultTargetUrl() -> Spring Security config 에서 지정한 defaultSuccessUrl 을 의미
		redirectStrategy.sendRedirect(request, response, getDefaultTargetUrl());
	}

}
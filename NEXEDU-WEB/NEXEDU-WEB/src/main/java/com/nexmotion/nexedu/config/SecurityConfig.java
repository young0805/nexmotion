package com.nexmotion.nexedu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.nexmotion.nexedu.account.AccountSuccessHandler;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {	
	// 권한이 없는 대상이 페이지 접근을 시도했을 때
	private String errorAccessDeniedRedirectURL = "/error/denied";

	// 로그인 아이디, 비밀번호를 묻는 페이지 경로
	private String loginURL = "/auth/login";

	// 로그인 form의 action url(반드시 form 과 일치시켜야 함)
	private String loginProcessingURL = "/auth/proc";

	// 로그인 성공 시 이동할 url
	private String loginSuccessUrl = "/";	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests() // 인가 관련 설정을 한다
				.antMatchers("/", "/auth/*", "/error/denied").permitAll() // url 허용
				
				.antMatchers("/video/*").permitAll() // for test
				
				// 그외 모두 접근을 허용하지 않으며, 사용자가 인증되지 않았다면, 스프링 시큐리티 필터는 요청을 잡아내고 사용자를 로그인 페이지로 리다이렉션 해준다.
				.anyRequest().authenticated()				 
				// login 세팅 : 하위에 내가 직접 구현한 로그인 폼, 로그인 성공시 이동 경로 설정 가능.
				// 로그인 폼의 아이디,패스워드는 username, password로 맞춰야 함
				.and()
				.formLogin()
				.loginPage(loginURL)				
				.loginProcessingUrl(loginProcessingURL) // form action 과 맞춰야 함
				.defaultSuccessUrl(loginSuccessUrl)
				.successHandler(new AccountSuccessHandler())
				// 인증에 실패했을 때 보여주는 화면 url, 로그인 form으로 파라미터값 error=true 로 보낸다
				.failureUrl(loginURL + "?error=true")
				.permitAll()
				// logout 세팅
				.and()
				.logout().permitAll()
				.logoutUrl("/auth/logout") // logout url
				.logoutSuccessUrl("/") // logout 이후 / 페이지로 이동
				// 접근권한이 없는 페이지에 대한 접근 설정
				.and()
				.exceptionHandling().accessDeniedPage(errorAccessDeniedRedirectURL)
				// csrf 설정
				.and().csrf().disable();
	}
	
	/**
	 * 사용자의 비밀번호 비교 혹은 비밀번호를 저장할 때 사용하는 encoder
	 * mysql 이나 oracle 등에 내장된 password 기능을 사용하지 않기 위해 사용
	 * 
	 * @return PasswordEncoder object
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

}
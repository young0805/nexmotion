package com.nexmotion.nexedu.account;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements UserDetailsService, AccountMapper {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	PasswordEncoder encoder;
	
	/**
	 * form 에서 /auth/proc 으로 action 을 보내게 되면, Spring Security 에 의해 /auth/proc 이 없더라도
	 * 자동으로 loadUserByUsername 메소드를 호출한다.
	 * 
	 * getAccount 를 통해 계정 정보가 없을 경우, UsernameNotFoundException 발생시 에러 페이지로 redirect 하며,
	 * 성공시 login 성공 URL 로 redirect 가 된다.
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = null;
		
		System.err.println("test");
								
		try {
			account = getAccount(username);
		} catch (Throwable e) {			
			throw new UsernameNotFoundException(username);
		}
		
		if (account == null) {
			// 계정 정보가 존재하지 않을때, throw 처리
			// throw 처리되면, /auth/login?error=true 로 이동하게 됨 
			throw new UsernameNotFoundException(username);
		}
		
		/*
		account.setAccountNonExpired(true);
		account.setAccountNonLocked(true);
		account.setCredentialsNonExpired(true);
		account.setEnabled(true);
		
		System.err.println("account=" + account);
		*/
		
		return account;
	}

	@Override
	public Account getAccount(String userid) throws Throwable {
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
		return mapper.getAccount(userid);
	}

}

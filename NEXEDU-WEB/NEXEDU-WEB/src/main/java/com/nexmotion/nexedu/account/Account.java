package com.nexmotion.nexedu.account;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Account implements UserDetails {
	private static final long serialVersionUID = -3940102472852201160L;
	
	private String userid;
	private String password;
	private String authority;
	private boolean isAccountNonExpired;
	private boolean isAccountNonLocked;
	private boolean isCredentialsNonExpired;
	private boolean isEnabled;
	
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	public void setAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	public String getUserid() {
		return this.userid;
	}
	
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	/**
	 * @return 계정이 갖고 있는 권한 목록을 반환
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
	    authorities.add(new SimpleGrantedAuthority(getAuthority()));
	    return authorities;
	}

	/**
	 * @return 비밀번호 반환
	 */
	@Override
	public String getPassword() {
		System.err.println("get password call=" + this.password);
		return this.password;
	}

	/**
	 * @return 사용자 이름 반환
	 */
	@Override
	public String getUsername() {
		System.err.println("get username call=" + this.getPassword());
		return this.userid;
	}

	/**
	 * @return 계정이 만료되지 않았는지를 반환(true: 만료되지 않음을 의미)
	 */
	@Override
	public boolean isAccountNonExpired() {
		return this.isAccountNonExpired;
	}

	/**
	 * @return 계정이 잠겨있지 않은지를 반환(true: 계정이 잠겨있지 않음을 의미)
	 */
	@Override
	public boolean isAccountNonLocked() {
		return this.isAccountNonLocked;
	}

	/**
	 * @return 계정의 패스워드가 만료되지 않았는지를 반환(true: 패스워드가 만료되지 않음을 의미)
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return this.isCredentialsNonExpired;
	}

	/**
	 * @return 계정이 사용가능한 계정인지를 반환(true: 사용가능한 계정 의미)
	 */
	@Override
	public boolean isEnabled() {
		return this.isEnabled;
	}

	@Override
	public String toString() {
		return "Account [userid=" + userid + ", password=" + password + ", authority=" + authority
				+ ", isAccountNonExpired=" + isAccountNonExpired + ", isAccountNonLocked=" + isAccountNonLocked
				+ ", isCredentialsNonExpired=" + isCredentialsNonExpired + ", isEnabled=" + isEnabled + "]";
	}

}

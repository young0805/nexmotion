package com.nexmotion.nexedu.account;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {
	
	/**
	 * userid 에 해당하는 account 정보를 반환한다.
	 * @param userid
	 * @return Account Object
	 * @throws Throwable
	 */
	public Account getAccount(@Param("userid") String userid) throws Throwable;	

}

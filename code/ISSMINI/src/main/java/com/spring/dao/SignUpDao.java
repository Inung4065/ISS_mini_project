package com.spring.dao;

import com.spring.dto.AccDto;

public interface SignUpDao {
	
	public AccDto selectAccForAccountId(String id);
	
	public void insertAcc(AccDto dto);
}

package com.spring.dao;

import com.spring.dto.AccDto;

public interface SignInDao {

	String NAMESPACE = "useDB.";

	// ������
	public AccDto signIn( AccDto accDto );
}

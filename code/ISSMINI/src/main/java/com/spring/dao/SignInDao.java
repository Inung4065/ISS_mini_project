package com.spring.dao;

import com.spring.dto.AccDto;

public interface SignInDao {

	String NAMESPACE = "useDB.";

	// «í«°«¤«ó
	public AccDto signIn( AccDto accDto );
}

package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.SignInDao;
import com.spring.dto.AccDto;

@Service
public class SignInServiceImpl implements SignInService {

	@Autowired
	private SignInDao dao;

	@Override
	public AccDto signIn( AccDto accDto ) {
		return dao.signIn( accDto );
	}
}

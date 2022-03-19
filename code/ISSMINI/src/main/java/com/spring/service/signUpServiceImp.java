package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dto.AccDto;
import com.spring.mapper.signUpMapper;

@Service
public class signUpServiceImp implements signUpService {
	
	@Autowired
	signUpMapper signupmapper;

	@Override
	public void accountAdd(AccDto acc) throws Exception {
		
		signupmapper.accountAdd(acc);
		
	}
}

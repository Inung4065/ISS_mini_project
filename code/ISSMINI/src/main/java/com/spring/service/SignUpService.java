package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.dto.AccDto;
import com.spring.info.SignUpInfo;

@Service
public interface SignUpService {
	
	public void accountAdd(AccDto acc) throws Exception;
	
	public String inputCheck(SignUpInfo info);
}

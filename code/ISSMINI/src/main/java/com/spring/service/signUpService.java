package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dto.AccDto;

@Service
public interface signUpService {
	
	public void accountAdd(AccDto acc) throws Exception;
}

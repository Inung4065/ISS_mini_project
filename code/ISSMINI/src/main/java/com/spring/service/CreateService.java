package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.info.BoardInfo;

@Service
public interface CreateService {
	
	public String inputCheck(BoardInfo info);
	
	public void boardAdd(BoardInfo info) throws Exception;
}

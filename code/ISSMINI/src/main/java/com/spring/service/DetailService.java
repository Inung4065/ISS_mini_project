package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.info.BoardInfo;

@Service
public interface DetailService {
	
	public void boardUpdate(BoardInfo info) throws Exception;
	
	public void boardDelete(BoardInfo info) throws Exception;
}

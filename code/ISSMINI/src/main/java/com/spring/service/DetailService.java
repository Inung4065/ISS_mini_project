package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.dto.BoaDto;
import com.spring.info.BoardInfo;

@Service
public interface DetailService {

	public BoaDto boardSelect(int no) throws Exception;

	public void boardUpdate(BoardInfo info) throws Exception;
	
	public void boardDelete(BoardInfo info) throws Exception;
}

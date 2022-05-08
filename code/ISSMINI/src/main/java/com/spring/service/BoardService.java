package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.dto.BoaDto;

@Service
public interface BoardService {
	
	public List<BoaDto> boardAll() throws Exception;
	
}

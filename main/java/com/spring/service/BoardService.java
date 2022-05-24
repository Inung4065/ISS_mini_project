package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.common.Pagination;
import com.spring.dto.BoaDto;

@Service
public interface BoardService {
	
	public List<BoaDto> boardAll(Pagination pagination) throws Exception;

	public int getBoardListCnt() throws Exception;
}

package com.spring.dao;

import java.util.List;

import com.spring.common.Pagination;
import com.spring.dto.BoaDto;

public interface BoardDao {
	
	public List<BoaDto> selectAllBoard(Pagination pagination);

	public int getBoardListCnt() throws Exception;
}

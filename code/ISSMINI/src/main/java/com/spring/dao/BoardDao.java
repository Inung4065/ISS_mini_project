package com.spring.dao;

import java.util.List;

import com.spring.common.Pagination;
import com.spring.dto.BoaDto;

public interface BoardDao {
	
	public List<BoaDto> selectAllBoard(Pagination pagination);

	public BoaDto selectBoard( int no );

	public int getBoardListCnt() throws Exception;
	
	public void insertBoard(BoaDto dto);
	
	public void updateBoard(BoaDto dto);

	public void deleteBoard(BoaDto dto);
}

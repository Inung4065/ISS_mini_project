package com.spring.dao;

import java.util.List;

import com.spring.dto.BoaDto;

public interface BoardDao {
	
	public List<BoaDto> selectAllBoard(BoaDto baodto);
}

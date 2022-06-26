package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.common.Pagination;
import com.spring.dao.BoardDao;
import com.spring.dto.BoaDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao dao;
	
	//件数を取得
	@Override
	public int getBoardListCnt() throws Exception {
		return dao.getBoardListCnt();
	}
	
	//すべてのSelect
	@Override
	public List<BoaDto> boardAll(Pagination pagination) throws Exception {
		return dao.selectAllBoard(pagination);
	}
}

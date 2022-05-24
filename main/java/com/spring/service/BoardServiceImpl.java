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

	@Override
	public int getBoardListCnt() throws Exception {
		return dao.getBoardListCnt();
	}

	@Override
	public List<BoaDto> boardAll(Pagination pagination) throws Exception {
		return dao.selectAllBoard(pagination);
	}
}

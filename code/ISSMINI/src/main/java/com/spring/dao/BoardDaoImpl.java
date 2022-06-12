package com.spring.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.common.Pagination;
import com.spring.dto.BoaDto;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<BoaDto> selectAllBoard(Pagination pagination) {
		return sqlSession.selectList("useDB.selectAllBoard", pagination);
	}

	@Override
	public BoaDto selectBoard( int no ) {
		return sqlSession.selectOne("useDB.selectBoard", no);
	}

	@Override
	public int getBoardListCnt() throws Exception {
		return sqlSession.selectOne("useDB.getBoardListCnt");
	}

	@Override
	public void insertBoard(BoaDto dto) {
		sqlSession.insert("useDB.insertBoa", dto);
	}

	@Override
	public void updateBoard(BoaDto dto) {		
		sqlSession.update("useDB.updateBoa", dto);
	}

	@Override
	public void deleteBoard(BoaDto dto) {
		sqlSession.update("useDB.deleteBoa", dto);
		
	}
}

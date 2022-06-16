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
	
	//すべてのSelect
	@Override
	public List<BoaDto> selectAllBoard(Pagination pagination) {
		return sqlSession.selectList("useDB.selectAllBoard", pagination);
	}
	
	//1つのSelect
	@Override
	public BoaDto selectBoard( int no ) {
		return sqlSession.selectOne("useDB.selectBoard", no);
	}

	//件数の取得
	@Override
	public int getBoardListCnt() throws Exception {
		return sqlSession.selectOne("useDB.getBoardListCnt");
	}
	
	//Insert
	@Override
	public void insertBoard(BoaDto dto) {
		sqlSession.insert("useDB.insertBoa", dto);
	}
	
	//更新
	@Override
	public void updateBoard(BoaDto dto) {		
		sqlSession.update("useDB.updateBoa", dto);
	}
	
	//削除
	@Override
	public void deleteBoard(BoaDto dto) {
		sqlSession.update("useDB.deleteBoa", dto);
		
	}
}

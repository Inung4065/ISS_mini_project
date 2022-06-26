package com.spring.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.dto.AccDto;

@Repository
public class SignUpDaoImpl implements SignUpDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//新規アカウントの重複確認のため、対象のアカウント取得
	@Override
	public AccDto selectAccForAccountId(String id) {
		AccDto result = sqlSession.selectOne("useDB.selectAccForAccountId", id);
		return result;
	}
	
	//新規アカウントをDBにinsert
	@Override
	public void insertAcc(AccDto dto) {
		sqlSession.insert("useDB.insertAcc", dto);
	}
}

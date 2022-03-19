package com.spring.dao;

import org.mybatis.spring.SqlSessionTemplate;
import com.spring.dto.AccDto;

public class AccDao {
	
	
	
	public AccDto SelectAccForAccountId(String id, SqlSessionTemplate session) {
		AccDto result = session.selectOne("useDB.selectAccForAccountId", id);
		return result;
	}
	
	public void InsertAcc(AccDto dto, SqlSessionTemplate session) {
		session.insert("useDB.insertAcc", dto);
	}
}

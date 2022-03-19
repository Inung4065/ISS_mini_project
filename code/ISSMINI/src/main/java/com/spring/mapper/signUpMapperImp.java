package com.spring.mapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dto.AccDto;

@Repository
public class signUpMapperImp implements signUpMapper {
	private static final String namespace = "com.spring.mapper.accountMapper";

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void accountAdd(AccDto acc) {
		//
		sqlSession.insert(namespace + ".accountAdd", acc);

	}
}

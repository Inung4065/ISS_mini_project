package com.spring.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dto.AccDto;

@Repository
public class SignInDaoImpl implements SignInDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public AccDto signIn( AccDto accDto ) {

		AccDto outAccDto = null;

		try {

			outAccDto = sqlSession.selectOne( NAMESPACE + "selectAccForSignIn", accDto );
		} catch ( Exception e ) {

			e.printStackTrace(  );
		}

		return outAccDto;
	}

}

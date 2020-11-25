package com.yuhan.dao;



import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Member_daoImpl implements Member_dao{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static String namespace="MemberMapper";
	
	// 회원가입
	public void Join(HashMap<String, String> map) throws Exception {
		
		sqlSession.insert(namespace+".join", map);
	}

}

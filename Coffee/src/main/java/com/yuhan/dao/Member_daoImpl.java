package com.yuhan.dao;





import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yuhan.dto.Member;
import com.yuhan.dto.Member_dto;
import com.yuhan.dto.RegisterRequest;

@Repository
public class Member_daoImpl extends AbstractDAO implements Member_dao {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static String namespace="MemberMapper";
	
	
	public List<Member> list() throws Exception{
		return sqlSession.selectList(namespace+".member_list");
	}
	
	public void insertMember(RegisterRequest regReq) throws Exception {
		sqlSession.insert(namespace+".register",regReq);
	}

	@Override
	public Member_dto selectByEmail(String email) throws Exception {
		
		return sqlSession.selectOne(namespace+".selectByEmail",email);
	}

	@Override
	public Member_dto selectById(String id) throws Exception {
		return sqlSession.selectOne(namespace+".selectById",id);
	}

	

	
}

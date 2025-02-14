package com.yuhan.dao;



import java.util.List;

import com.yuhan.dto.Member;
import com.yuhan.dto.Member_dto;
import com.yuhan.dto.RegisterRequest;



public interface Member_dao{
	
	
	//회원가입
	public void insertMember(RegisterRequest regReq) throws Exception;
	
	//이메일 선택
	public Member_dto selectByEmail(String email) throws Exception;
	
	//아이디 선택
	public Member_dto selectById(String id) throws Exception;
	
	//회원조회
	public List<Member> list() throws Exception;
}

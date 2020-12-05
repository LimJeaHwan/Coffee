package com.yuhan.service;

import java.util.List;

import com.yuhan.dto.Member;
import com.yuhan.dto.RegisterRequest;

public interface Member_Service {
	
	//회원 가입
	public void register(RegisterRequest regReq) throws Exception;
	
	//회원 조회
	public List<Member> list() throws Exception;
}

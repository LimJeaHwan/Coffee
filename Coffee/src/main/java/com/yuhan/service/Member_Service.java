package com.yuhan.service;

import com.yuhan.dto.RegisterRequest;

public interface Member_Service {
	
	//회원 가입
	public void register(RegisterRequest regReq) throws Exception;
	
}

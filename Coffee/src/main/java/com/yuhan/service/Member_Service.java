package com.yuhan.service;

import java.util.List;

import com.yuhan.dto.Member;
import com.yuhan.dto.RegisterRequest;

public interface Member_Service {
	
	//ȸ�� ����
	public void register(RegisterRequest regReq) throws Exception;
	
	//ȸ�� ��ȸ
	public List<Member> list() throws Exception;
}

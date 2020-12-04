package com.yuhan.dao;



import com.yuhan.dto.Member_dto;
import com.yuhan.dto.RegisterRequest;



public interface Member_dao{
	
	
	//ȸ������
	public void insertMember(RegisterRequest regReq) throws Exception;
	
	//�̸��� ����
	public Member_dto selectByEmail(String email) throws Exception;
	
	//���̵� ����
	public Member_dto selectById(String id) throws Exception;
}

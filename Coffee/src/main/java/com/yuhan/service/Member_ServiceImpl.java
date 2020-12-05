package com.yuhan.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuhan.coffee.exception.AlreadyExistingEmailException;
import com.yuhan.dao.Member_dao;
import com.yuhan.dto.Member;
import com.yuhan.dto.Member_dto;
import com.yuhan.dto.RegisterRequest;

@Service
public class Member_ServiceImpl implements Member_Service {
	
	@Autowired
	private Member_dao dao;
	
	//회원조회
	public List<Member> list() throws Exception{
		return dao.list();
	}
	
	//회원가입
	public void register(RegisterRequest regReq) throws Exception {
		Member_dto email = dao.selectByEmail(regReq.getM_email());
		if(email!=null) {
			throw new AlreadyExistingEmailException(regReq.getM_email()+"is duplicate email.");
		}
		Member_dto id = dao.selectByEmail(regReq.getM_id());
		if(id!=null) {
			throw new AlreadyExistingEmailException(regReq.getM_id()+"is duplicate email.");
		}
		dao.insertMember(regReq);
	}

	
	
	
	
	
	

}

package com.yuhan.service;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuhan.dao.Member_dao;

@Service
public class Member_ServiceImpl implements Member_Service {
	
	@Autowired
	private Member_dao dao;

	
	//회원가입
	public void Join(String m_id, String m_pwd, String m_sex, String m_phone, String m_addr) throws Exception {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("param1",m_id);
		map.put("param2",m_pwd);
		map.put("param3",m_sex);
		map.put("param4",m_phone);
		map.put("param5",m_addr);
		
		dao.Join(map);
	}
	
	
	

}

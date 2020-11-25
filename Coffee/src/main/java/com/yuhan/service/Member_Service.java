package com.yuhan.service;



public interface Member_Service {
	
	//회원 가입
	public void Join(String m_id,String m_pwd,
			String m_sex,String m_phone,String m_addr) throws Exception;
	
}

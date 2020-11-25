package com.yuhan.dto;

public class Member_dto {
	private int m_no;
	private String m_id;
	private String m_pwd;
	private String m_phone;
	private String m_addr;
	private int m_point;
	
	
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pwd() {
		return m_pwd;
	}
	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_addr() {
		return m_addr;
	}
	public void setM_addr(String m_addr) {
		this.m_addr = m_addr;
	}
	public int getM_point() {
		return m_point;
	}
	public void setM_point(int m_point) {
		this.m_point = m_point;
	}
	
	@Override
	public String toString() {
		return "Member_dto [m_no=" + m_no + ", m_id=" + m_id + ", m_pwd=" + m_pwd + ", m_phone=" + m_phone + ", m_addr="
				+ m_addr + ", m_point=" + m_point + "]";
	}
	
	
}

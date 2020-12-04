package com.yuhan.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class RegisterRequest{
	
	@Column
	@Pattern(regexp="\\w(4,15)",message="아이디를 4~15자로 입력하세요.")
	private String m_id;
	
	@Column
	@Pattern(regexp="\\S(4,8)",message="이름을 공백없이 2~6자로 입력해주세요.")
	private String m_name;
	
	@Column
	@NotEmpty(message="이름을 입력해주세요.")
	@Email(message="이메일을 형식에 맞춰 올바르게 입력해주세요.")
	private String m_email;
	
	@Column
	@NotEmpty(message="주소를 입력해주세요.")
	private String m_addr;
	
	@Column
	@Size(min=4,max=12, message="비밀번호를 4~12자로 입력해주세요.")
	private String m_pwd;
	
	@Column
	@Size(min=4,max=12, message="비밀번호를 4~12자로 입력해주세요.")
	private String check_m_pwd;
	
	
	
	
	//비밀번호 확인
		public boolean isPwEqualToCheckpwd() {
			return m_pwd.equals(check_m_pwd);
		}
	
	public String getM_name() {
		return m_name;
	}


	public void setM_name(String m_name) {
		this.m_name = m_name;
	}


	public String getM_email() {
		return m_email;
	}


	public void setM_email(String m_email) {
		this.m_email = m_email;
	}


	public RegisterRequest() {
		
	}
	
	
	
	
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_addr() {
		return m_addr;
	}
	public void setM_addr(String m_addr) {
		this.m_addr = m_addr;
	}
	public String getM_pwd() {
		return m_pwd;
	}
	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}
	public String getCheck_m_pwd() {
		return check_m_pwd;
	}
	public void setCheck_m_pwd(String check_m_pwd) {
		this.check_m_pwd = check_m_pwd;
	}
	
	
	
	
	
}

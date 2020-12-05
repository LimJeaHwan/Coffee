package com.yuhan.dto;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class LoginCommand {
	
	@NotEmpty(message="���̵� �Է����ּ���.")
	private String id;
	
	@NotEmpty(message="��й�ȣ�� �Է����ּ���.")
	private String pw;
	
	private boolean remeberId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public boolean isRemeberId() {
		return remeberId;
	}

	public void setRemeberId(boolean remeberId) {
		this.remeberId = remeberId;
	}
	
	
	
	

	
}

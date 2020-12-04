package com.yuhan.util;



import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.yuhan.dto.RegisterRequest;

public class RegisterRequestVaildator implements Validator{
	
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return RegisterRequest.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		RegisterRequest regReq = (RegisterRequest) target;
		if(regReq.getM_email() == null || regReq.getM_email().trim().isBlank()) {
			errors.rejectValue("email","required","�ʼ� ���� �Դϴ�.");
		}
		ValidationUtils.rejectIfEmpty(errors, "m_id", "required","���̵� �Է����ּ���.");
		ValidationUtils.rejectIfEmpty(errors, "m_name", "required","�̸��� �Է����ּ���.");
		ValidationUtils.rejectIfEmpty(errors,"m_pwd","required","��й�ȣ�� �Է����ּ���.");
		ValidationUtils.rejectIfEmpty(errors,"check_m_pwd","required","��й�ȣ�� Ȯ�����ּ���.");
		ValidationUtils.rejectIfEmpty(errors,"m_addr","required","�ּҰ� �Էµ��� �ʾҽ��ϴ�.");
		
		if(!regReq.getM_pwd().isEmpty()) {
			if(!regReq.isPwEqualToCheckpwd()) {
				errors.rejectValue("check_m_pwd", "nomatch", "��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}
	}

}

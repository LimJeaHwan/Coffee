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
			errors.rejectValue("email","required","필수 정보 입니다.");
		}
		ValidationUtils.rejectIfEmpty(errors, "m_id", "required","아이디 입력해주세요.");
		ValidationUtils.rejectIfEmpty(errors, "m_name", "required","이름을 입력해주세요.");
		ValidationUtils.rejectIfEmpty(errors,"m_pwd","required","비밀번호를 입력해주세요.");
		ValidationUtils.rejectIfEmpty(errors,"check_m_pwd","required","비밀번호를 확인해주세요.");
		ValidationUtils.rejectIfEmpty(errors,"m_addr","required","주소가 입력되지 않았습니다.");
		
		if(!regReq.getM_pwd().isEmpty()) {
			if(!regReq.isPwEqualToCheckpwd()) {
				errors.rejectValue("check_m_pwd", "nomatch", "비밀번호가 일치하지 않습니다.");
			}
		}
	}

}

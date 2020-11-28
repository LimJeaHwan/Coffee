package com.yuhan.coffee.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuhan.dto.Member_dto;
import com.yuhan.service.Member_Service;

@Controller
public class MemberController {
	
	@Autowired
	private Member_Service member_service;
	
	@Autowired
	private PasswordEncoder passwordEncoding;
	
	@RequestMapping(value="/join.do",method = RequestMethod.POST)
	public String Join(@Validated Member_dto member,BindingResult result,HttpServletRequest request) throws Exception
	{
		if(result.hasErrors()) {
			return"";
		}
		
		member_service.Join(request.getParameter("m_id") ,
				request.getParameter("m_pwd") ,request.getParameter("m_sex")
				,request.getParameter("m_phone") ,request.getParameter("m_addr"));
		
		return"redirect:/";
	}
}

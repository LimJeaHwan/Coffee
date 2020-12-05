package com.yuhan.coffee.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.acls.model.AlreadyExistsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yuhan.coffee.exception.AlreadyExistingEmailException;
import com.yuhan.coffee.exception.AlreadyExistingIdException;
import com.yuhan.dto.Member;
import com.yuhan.dto.Member_dto;
import com.yuhan.dto.RegisterRequest;
import com.yuhan.service.Member_Service;
import com.yuhan.util.RegisterRequestVaildator;

@Controller
public class MemberController {
	
	@Autowired
	private Member_Service member_service;
	
	@Autowired
	private PasswordEncoder passwordEncoding;
	
	
	
	@RequestMapping("/register/step1")
	public String step1() throws Exception
	{
		return"member/register/step1";
	}
	
	@RequestMapping("/register/step2")
    public ModelAndView step2(@RequestParam(value="agree", defaultValue="false") Boolean agree) throws Exception {
        if(!agree) {
            ModelAndView mv = new ModelAndView("member/register/step1");
            return mv;
        }
        ModelAndView mv = new ModelAndView("member/register/step2");
        mv.addObject("registerRequest", new RegisterRequest());
        return mv;
    }


	
	@RequestMapping("/register/step3")
	public ModelAndView step3(@Valid RegisterRequest regReq,BindingResult bindingResult) throws Exception
	{
		
		//@Valid검증
		if(bindingResult.hasErrors()) {
			ModelAndView mv = new ModelAndView("member/register/step2");
			return mv;
		}
		boolean check = regReq.isPwEqualToCheckpwd();
		if(!check) {
			bindingResult.rejectValue("check_m_pwd", "noMatch","비밀번호를 확인해주세요.");
			ModelAndView mv = new ModelAndView("member/register/step2");
			return mv;
		}
		
		try {
			String inputPassword = regReq.getM_pwd();
			regReq.setM_pwd(passwordEncoding.encode(inputPassword));
			member_service.register(regReq);
			
		} catch (AlreadyExistingEmailException e) {
			bindingResult.rejectValue("m_email", "duplicate","이미 가입된 이메일입니다.");
			ModelAndView mv = new ModelAndView("member/register/step2");
			return mv;
		}
		catch (AlreadyExistingIdException e) {
			bindingResult.rejectValue("m_id", "duplicate","이미 가입된 아이디입니다.");
			ModelAndView mv = new ModelAndView("member/register/step2");
			return mv;
		}
		ModelAndView mv = new ModelAndView("member/register/step3");
		return mv;
	}
	
	@RequestMapping("/member/admin/list")
	public ModelAndView list() throws Exception{
		List<Member> list = member_service.list();
		ModelAndView mv = new ModelAndView("member/admin/list");
		mv.addObject("list", list);
		return mv;
	}
}

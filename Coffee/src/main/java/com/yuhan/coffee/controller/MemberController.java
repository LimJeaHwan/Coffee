package com.yuhan.coffee.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.acls.model.AlreadyExistsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yuhan.coffee.exception.AlreadyExistingEmailException;
import com.yuhan.coffee.exception.AlreadyExistingIdException;
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
	public ModelAndView step3(RegisterRequest regReq,Errors errors) throws Exception
	{
		new RegisterRequestVaildator().validate(regReq, errors);
		if(errors.hasErrors()) {
			ModelAndView mv = new ModelAndView("member/register/step2");
			return mv;
		}
		try {
			member_service.register(regReq);
		} catch (AlreadyExistingEmailException e) {
			errors.rejectValue("m_email", "duplicate","�̹� ���Ե� �̸����Դϴ�.");
			ModelAndView mv = new ModelAndView("member/register/step2");
			return mv;
		}
		catch (AlreadyExistingIdException e) {
			errors.rejectValue("m_id", "duplicate","�̹� ���Ե� ���̵��Դϴ�.");
			ModelAndView mv = new ModelAndView("member/register/step2");
			return mv;
		}
		ModelAndView mv = new ModelAndView("member/register/step3");
		return mv;
	}
	
	
//	@RequestMapping(value="/join.do",method = RequestMethod.POST)
//	public String Join(@Validated Member_dto member,BindingResult result,HttpServletRequest request) throws Exception
//	{
//		if(result.hasErrors()) {
//			
//			return"redirect:/";
//		}
//		
//		String inputPassword = request.getParameter("m_pwd");
//		passwordEncoding.encode(inputPassword);
//		
//		member_service.Join(request.getParameter("m_id") ,
//				inputPassword ,request.getParameter("m_sex")
//				,request.getParameter("m_phone") ,request.getParameter("m_addr"));
//		
//		return"redirect:/";
//	}
}

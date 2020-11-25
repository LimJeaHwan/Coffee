package com.yuhan.coffee;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuhan.service.Member_Service;

@Controller
public class HomeController {
	
	@Autowired
	private Member_Service member_service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		String str = "가져온 데이터";
		
		model.addAttribute("data", str );
		
		return "home";
	}
	
	@RequestMapping(value = "/menu/list", method = RequestMethod.GET)
	public String menu(Model model)
	{
		String str ="메뉴";
		
		model.addAttribute("menu", str);
		return "menu/menu";
	}
	
	@RequestMapping(value="/join.do",method = RequestMethod.POST)
	public String Join(HttpServletRequest request) throws Exception
	{
		member_service.Join(request.getParameter("m_id") ,
				request.getParameter("m_pwd") ,request.getParameter("m_sex")
				,request.getParameter("m_phone") ,request.getParameter("m_addr"));
		
		return"redirect:/";
	}
	
}

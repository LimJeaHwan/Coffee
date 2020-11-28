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
	
	
	
}

package com.yuhan.coffee;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yuhan.dto.LoginCommand;
import com.yuhan.service.Member_Service;

@Controller
public class HomeController {
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(LoginCommand loginCommand,@CookieValue(value="REMEMBER",required = false) Cookie rememberCookie,Model model) {
		
		if(rememberCookie!= null) {
			loginCommand.setId(rememberCookie.getValue());
			loginCommand.setRemeberId(true);
		}
		
		String str = "È¨";
		
		model.addAttribute("data", str );
		
		ModelAndView mv = new ModelAndView("home");
		
		return mv;
	}
	
	
	
	@RequestMapping(value = "/menu/list", method = RequestMethod.GET)
	public String menu(Model model)
	{
		String str ="¸Þ´º";
		
		model.addAttribute("menu", str);
		return "menu/menu";
	}
	
	
	
}

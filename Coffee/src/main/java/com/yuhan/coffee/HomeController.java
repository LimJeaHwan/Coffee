package com.yuhan.coffee;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		String str ="메뉴리스트";
		
		model.addAttribute("menu", str);
		return "menu/list";
	}
	
}

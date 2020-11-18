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
		
		String str = "������ ������";
		
		model.addAttribute("data", str );
		
		return "home";
	}
	
	@RequestMapping(value = "/menu/list", method = RequestMethod.GET)
	public String menu(Model model)
	{
		String str ="�޴�����Ʈ";
		
		model.addAttribute("menu", str);
		return "menu/list";
	}
	
}

//usage of RequestMapping and GetMapping

package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;


@Controller
public class UserController {
	//using requestParam
	@RequestMapping("/hello")
	public String display(@RequestParam("userId")int userId,@RequestParam("userName")String userName,@RequestParam("password")String password,Model m)
	{
		String msg="Hello: "+userName;
		m.addAttribute("message",msg);
		return "viewpage";
	}
	@GetMapping("/path/18/Gowthu")
	public String welcome1(Model model)
	{
		String msg="INTO THE LINK ";
		model.addAttribute("message",msg);
		return "viewpage";
	}
		
}

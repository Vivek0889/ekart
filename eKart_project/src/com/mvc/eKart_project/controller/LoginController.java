/**
 * 
 */
package com.mvc.eKart_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.eKart_project.service.LoginService;

/**
 * @author vivek
 *
 */
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String authenticateDetails(@RequestParam(value= "un", required= false) String userName, @RequestParam(value= "ps", required= false) String password) {
		System.out.println("It authenticate method");
		System.out.println(userName);
		System.out.println(password);
		boolean isValidLogin = loginService.loginValidation(userName, password);
		System.out.println("isValidLogin    "+isValidLogin);
		if (isValidLogin == true) {
			return "Home";
		} else {
			return "index";
		}			
	}
}

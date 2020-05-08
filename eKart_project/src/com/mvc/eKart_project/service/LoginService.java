package com.mvc.eKart_project.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class LoginService {
		public boolean loginValidation(String username, String password) {
			
			boolean isValid = Boolean.FALSE;
			if("admin".equalsIgnoreCase(username) && "admin".equals(password)) {

				isValid = Boolean.TRUE;
			}
			return isValid;
		}
	}

package com.panther.gradadm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/")
public class LoginController {

	@RequestMapping("/")
	public String showDashBoard() {
		return "dashBoard";
	}
	
	@GetMapping("/graduateApplicationLogin")
	public String showGradApplicationLoginPage() {
		System.out.println("Show login url was hit");
		return "loginPage";
	}
}

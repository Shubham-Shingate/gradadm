package com.panther.gradadm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

	@GetMapping("/graduateApplicationLogin")
	public String showGradApplicationLoginPage() {
		System.out.println("Show login url was hit");
		return "loginPage";
	}
}

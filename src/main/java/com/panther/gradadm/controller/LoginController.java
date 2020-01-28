package com.panther.gradadm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/")
public class LoginController {
	
	@GetMapping("/")
    public String showLandingPage() {
        return "landingPage";
    }
	
	@GetMapping("/students")
	public String showStudentDashBoard() {
		return "studentDashBoard";
	}
	
	@GetMapping("/admins")
	public String showAdminDashBoard() {
		return "adminDashBoard";
	}
	
	@GetMapping("/graduateApplicationLogin")
	public String showGradApplicationLoginPage() {
		System.out.println("Show login url was hit");
		return "loginPage";
	}
}

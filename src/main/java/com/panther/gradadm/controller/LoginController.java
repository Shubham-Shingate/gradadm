package com.panther.gradadm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	
//	@GetMapping("/admins/add")
//	public String addAdmin() {
//		return "adminDashBoard";
//	}
	
	@GetMapping("/graduateApplicationLogin")
	public String showGradApplicationLogin() {
		System.out.println("Show login url was hit");
		return "gradApplicationLogin";
	}
}

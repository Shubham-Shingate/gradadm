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

	@GetMapping("/signup")
    public String showSignUpPage() {
        return "gradApplicationSignup";
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
//		public String addAdmin() {
//		return "adminDashBoard";
//	}
	
	@GetMapping("/graduateApplicationLogin")
	public String showGradApplicationLoginPage() {
		System.out.println("Show login url was hit");
		return "gradApplicationLogin";
	}
	
	@GetMapping("/accessDenied")
    public String showAccessDeniedPage() {
        return "accessDenied";
    }
}

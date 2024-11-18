package com.jdc.balance_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecurityController {
	
	@GetMapping("signin")
	public void LoadSignIn() {

	}
	
	@PostMapping("signin")
	public String sighIn() {
		return "redirect:/";
	}
	
	@GetMapping("signup")
	public void LoadSignUp() {

	}
	@PostMapping("signup")
	public String sighUp() {
		return "redirect:/";
	}
	
	@GetMapping("signout")
	public String sighOut() {
		// TODO Sign Out Logics
		return "redirect:/signin";
	}
	
	@PostMapping("user/changepass")
	public String changePass() {
		return "redirect:/";	
	}

}

package com.sample.thymeleaf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sample.common.dao.entity.Login;
import com.sample.common.service.LoginService;

import jakarta.validation.Valid;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	// ログイン画面の表示
	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}
	
	

	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("login") Login login , BindingResult bindingResult) {
		//バリデーションエラーが起きたかチェック
		if(bindingResult.hasErrors()) {
			return "login";
		}
		
		//ログインに成功したらタスク画面を表示
		loginService.login(login.getUsername());
		return "redirect:/tasks";
	}

}

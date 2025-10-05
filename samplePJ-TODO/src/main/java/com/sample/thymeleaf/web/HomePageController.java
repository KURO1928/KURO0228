package com.sample.thymeleaf.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sample.common.dao.entity.User;
import com.sample.common.service.LoginService;

import jakarta.validation.Valid;

@Controller
public class HomePageController {
	
	@Autowired
	private LoginService loginService;
	
    @GetMapping("/")
    //ホームページを表示//
    public String homePage() {
        return "homePage";
    }
    
    //ユーザー登録画面を表示//
    @GetMapping("/register")
    public String registerPage(Model model) {
    	model.addAttribute("user", new User());
    	return "register";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("user") User user , BindingResult bindingResult) {
    	//バリデーションエラーが起きたかチェック
    	if(bindingResult.hasErrors()) {
    		// エラーがある場合は、登録画面（register.html）に戻る
    		return "register";
    	}
    	
    	if(loginService.isUsernameTaken(user.getUsername())) {
    		bindingResult.addError(new FieldError("user","username", "このユーザー名は既に登録されています。"));
    		return "register";
    	}
    	
    	// エラーがない場合のみ、サービスを呼び出して登録処理を実行
    	loginService.register(user);
    	// 登録成功後、ログインページにリダイレクト
    	return "redirect:/login";
    	
    }
}
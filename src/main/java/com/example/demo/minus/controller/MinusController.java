package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

@Controller
public class MinusController {
	
	//依存性の注入
	private final MinusService minusService;
	
	//コンストラクタ
	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}

	@GetMapping("/minus")
	public String showMinus(Model model) {
		return "minus";
	}

	@PostMapping("/minus")
	public String calculateMinus(
			@RequestParam("leftNum") int leftNum,
			@RequestParam("rightNum") int rightNum,
			Model model) {
		int result = minusService.calculateMinus(leftNum, rightNum);
		
		//リクエストスコープに格納
		model.addAttribute("result", result);
		
		//結果を返す
		return "minus";
	}

}

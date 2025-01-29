package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {
	//計算処理
	private final CalculatorService calculatorService;

	//依存性の注入
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;

	}

	@GetMapping("/calculator")
	public String showCalcuiator() {
		return "calculator";
	}

	@PostMapping("/calculator")
	public String calculator(
			@RequestParam("leftNum") int leftNum,
			@RequestParam("rightNum") int rightNum,
			@RequestParam("operator") String operator, Model model) {

		//計算処理、結果の取得
		String result = calculatorService.calculate(leftNum, rightNum, operator);

		//計算結果をモデルに追加
		model.addAttribute("result", result);
		//計算画面に遷移
		return "calculator";
	}

}

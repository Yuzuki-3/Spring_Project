package com.example.demo.controller.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.controller.multi.service.MultiService;

/**
 * リクエストの受け取り
 * multi.htmlに掛け算結果を渡してあげる(リクエストスコープに格納)
 * multi.htmlの表示
 */

@Controller
public class MultiController {
	
	private final MultiService multiService;
	//依存性の注入
	//ServiceクラスのインスタンスをSpringbootから受け取る
	//コンストラクタ
	public MultiController(MultiService multiService) {
		this.multiService = multiService;
	}
	
	@GetMapping("multi")
	public String multi(Model model) {
		int rezult = multiService.multiNum(5,6);
		//リクエストスコープに格納
		model.addAttribute("result", rezult);
		return "multi.html";
	}
	

}

package com.example.demo.sampleAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.sampleAPI.data.Animals;
import com.example.demo.sampleAPI.service.SampleAPIService;

@Controller
public class SampleAPIController {

	private final SampleAPIService sampleAPIService;

	public SampleAPIController(SampleAPIService sampleAPIService) {
		this.sampleAPIService = sampleAPIService;
	}

	@GetMapping("/sampleAPI")
	public String getPets(Model model) throws IOException {

		//serviceクラスのメソッド呼び出し、動物一覧入手
		List<Animals> animalsList = sampleAPIService.getAnimals();
		//動物一覧をリクエストスコープに格納
		model.addAttribute("animalsList", animalsList);

		return "sampleAPI.html";

	}

}

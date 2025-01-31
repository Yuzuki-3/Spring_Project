package com.example.demo.animalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.animalsAPI.data.AnimalData;
import com.example.demo.animalsAPI.service.AnimalService;

@Controller
public class AnimalController {

	private final AnimalService animalService;

	public AnimalController(AnimalService animalService) {
		this.animalService = animalService;
	}

	@GetMapping("/animalSearch")
	public String getAnimals(Model model) throws IOException {

		//serviceクラスのメソッド呼び出し、動物一覧入手
		List<AnimalData> animalsList = animalService.getAnimals();
		//動物一覧をリクエストスコープに格納
		model.addAttribute("animalsList", animalsList);

		return "animal-search.html";

	}
	
	@PostMapping("/AnimalDetail")
	public String getAnimalDetail(@RequestParam("id") String id, Model model) throws IOException {
		AnimalData[] animalData = animalService.getAnimalById(id);
		model.addAttribute("animalData", animalData);
		return "animal-detail.html";
	}

}

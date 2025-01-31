package com.example.demo.animalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsAPI.data.AnimalData;
//import com.example.demo.animalsAPI.repository.SampleAPIRepository
import com.example.demo.animalsAPI.repository.AnimalRepository;

@Service
public class AnimalService {

	private final AnimalRepository animalRepository;

	public AnimalService(AnimalRepository animalRepository) {
		this.animalRepository = animalRepository;
	}

	public List<AnimalData> getAnimals() throws IOException {

		AnimalData[] animalsList = animalRepository.getAnimalData();

		//配列からListへの変換
		return Arrays.asList(animalsList);

	}
	
	public AnimalData[] getAnimalById(String id) throws IOException {
		
		return animalRepository.getAnimalById(id);
	}
	
}

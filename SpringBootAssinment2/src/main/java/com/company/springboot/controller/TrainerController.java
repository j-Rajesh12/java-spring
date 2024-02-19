package com.company.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.springboot.entity.Trainer;
import com.company.springboot.service.TrainerService;
import com.company.springboot.utility.ResponseStructure;

@RestController
@RequestMapping(value = "/trainers")
public class TrainerController {
	
	@Autowired
	private TrainerService trainerSrevice;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Trainer>> addTrainer(@RequestBody Trainer trainer){
		return trainerSrevice.addTrainer(trainer);
	}
	
	@GetMapping("/{trainerId}")
	public ResponseEntity<ResponseStructure<Trainer>> finfTrainer(@PathVariable int trainerId){
		return trainerSrevice.findTrainer(trainerId);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<ResponseStructure<List<Trainer>>> findAll(){
		return trainerSrevice.findAll();
	}
	
	

}

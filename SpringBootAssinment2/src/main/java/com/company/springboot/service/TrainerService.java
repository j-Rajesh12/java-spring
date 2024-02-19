package com.company.springboot.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.company.springboot.entity.Trainer;
import com.company.springboot.utility.ResponseStructure;

public interface TrainerService {

	public ResponseEntity<ResponseStructure<Trainer>> addTrainer(Trainer trainer);

	public ResponseEntity<ResponseStructure<Trainer>> findTrainer(int trainerId);

	public ResponseEntity<ResponseStructure<List<Trainer>>> findAll();

}

package com.company.springboot.servicveimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.company.springboot.entity.Trainer;
import com.company.springboot.exception.TrainerNotFoundByIdException;
import com.company.springboot.repository.TrainerRepository;
import com.company.springboot.service.TrainerService;
import com.company.springboot.utility.ResponseStructure;
@Service
public class TrainerServiceImpl implements TrainerService{

	@Autowired
	private TrainerRepository trainerRepository;

	@Override
	public ResponseEntity<ResponseStructure<Trainer>> addTrainer(Trainer trainer) {
		Trainer trainer1 = trainerRepository.save(trainer);
		ResponseStructure<Trainer> responseStructure=new ResponseStructure<>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("Trainer object created successfully ");
		responseStructure.setData(trainer1);
		return new ResponseEntity<ResponseStructure<Trainer>>(responseStructure,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<Trainer>> findTrainer(int trainerId) {
		Optional<Trainer> optional = trainerRepository.findById(trainerId);

		if(optional.isPresent()) {
			Trainer trainer = optional.get();

			ResponseStructure<Trainer> responseStructure=new ResponseStructure<>();
			responseStructure.setStatus(HttpStatus.FOUND.value());
			responseStructure.setMessage("Trainer object found successfully ");
			responseStructure.setData(trainer);
			return new ResponseEntity<ResponseStructure<Trainer>>(responseStructure,HttpStatus.FOUND);

		}else {
			throw new TrainerNotFoundByIdException("Trainer not Found");
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Trainer>>> findAll() {
		List<Trainer> list = trainerRepository.findAll();

		ResponseStructure<List<Trainer>> responseStructure=new ResponseStructure<>();
		responseStructure.setStatus(HttpStatus.FOUND.value());
		responseStructure.setMessage("All Trainer objects are found successfully ");
		responseStructure.setData(list);
		return new ResponseEntity<ResponseStructure<List<Trainer>>>(responseStructure,HttpStatus.FOUND);

	}

}

package com.company.springboot.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.company.springboot.exception.TrainerNotFoundByIdException;

@RestControllerAdvice
public class ApplicatinHandler {
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> trainerNotFoundById(TrainerNotFoundByIdException ex){
		ResponseStructure<String> responseStructure=new ResponseStructure<>();
		responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage(ex.getMessage());
		responseStructure.setData("Trainer Object with the given Id does not Exist");
		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.NOT_FOUND);

	}

}

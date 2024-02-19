package com.company.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Trainer {
	@Id
	private int trainerId;
	private String trainerName;
	private String trainerEmail;
	private double trainerSalary;
	private String trainerSubject;
	
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerEmail() {
		return trainerEmail;
	}
	public void setTrainerEmail(String trainerEmail) {
		this.trainerEmail = trainerEmail;
	}
	public double getTrainerSalary() {
		return trainerSalary;
	}
	public void setTrainerSalary(double trainerSalary) {
		this.trainerSalary = trainerSalary;
	}
	public String getTrainerSubject() {
		return trainerSubject;
	}
	public void setTrainerSubject(String trainerSubject) {
		this.trainerSubject = trainerSubject;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerEmail=" + trainerEmail
				+ ", trainerSalary=" + trainerSalary + ", trainerSubject=" + trainerSubject + "]";
	}

	
	
}

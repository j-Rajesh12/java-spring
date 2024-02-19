package com.company.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.springboot.entity.Trainer;
@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{

}

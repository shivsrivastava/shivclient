package com.shivassignment.springboot.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shivassignment.springboot.microservice.example.document.SumCalculation;
import com.shivassignment.springboot.microservice.example.service.CalculationService;

public interface SumCalculationRepository extends MongoRepository<SumCalculation, Integer> {

}

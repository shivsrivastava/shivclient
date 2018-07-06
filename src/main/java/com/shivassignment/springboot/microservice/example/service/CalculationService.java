package com.shivassignment.springboot.microservice.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import com.shivassignment.springboot.microservice.example.document.SumCalculation;
import com.shivassignment.springboot.microservice.repository.SumCalculationRepository;

@Service
public class CalculationService {
	
	@Autowired
	  private SumCalculationRepository repository;
	
	public SumCalculation sumOfTwoNumbers(int a, int b,int c){
		SumCalculation sumcalc = new SumCalculation(a,b,c);
		repository.save(sumcalc);
		return sumcalc;		
	}
	
	public List<SumCalculation>getAllSum(){
		
		return repository.findAll();
	}
}

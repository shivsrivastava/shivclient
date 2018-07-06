package com.shivassignment.springboot.microservice.example.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SumCalculation {
	@Id
	private Integer firstNo;
	private Integer secondNo;
	private Integer sumOfNumber;
	
	public SumCalculation(Integer firstNo, Integer secondNo, Integer sumOfNumber) {
		super();
		this.firstNo = firstNo;
		this.secondNo = secondNo;
		this.sumOfNumber = sumOfNumber;
	}
	public Integer getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(Integer firstNo) {
		this.firstNo = firstNo;
	}
	public Integer getSecondNo() {
		return secondNo;
	}
	public void setSecondNo(Integer secondNo) {
		this.secondNo = secondNo;
	}
	public Integer getSumOfNumber() {
		return sumOfNumber;
	}
	public void setSumOfNumber(Integer sumOfNumber) {
		this.sumOfNumber = sumOfNumber;
	}
	
}

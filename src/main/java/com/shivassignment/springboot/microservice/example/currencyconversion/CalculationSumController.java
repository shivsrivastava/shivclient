package com.shivassignment.springboot.microservice.example.currencyconversion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shivassignment.springboot.microservice.example.document.SumCalculation;
import com.shivassignment.springboot.microservice.example.service.CalculationService;

@RestController
public class CalculationSumController {

  private Logger logger = LoggerFactory.getLogger(this.getClass());
  
  @Autowired
  CalculationService calculationService;
  
  /*
   * getAllSum() method to get all
   * the related summation till now.
   */
  @GetMapping("/sum/getall")
  public List<SumCalculation> getAllSum() {   
  return calculationService.getAllSum();
 }
  
  /*
   * addTwoNumbersAndPersist() method uses the 
   * Addition RestWebService and persist the
   * all values in DB.
   */
  
  @PostMapping("/sum/{first}/and/{second}")
  public ResponseEntity<Boolean> addTwoNumbersAndPersist(@PathVariable String first, @PathVariable String second) {

    Map<String, String> uriVariables = new HashMap<>();
    uriVariables.put("first", first);
    uriVariables.put("second", second);
    
    ResponseEntity<Integer> responseEntity = new RestTemplate().getForEntity(
        "http://localhost:8000/sum/{first}/and/{second}", Integer.class,
        uriVariables);

    Integer responseSum = responseEntity.getBody();

   SumCalculation sumcalc= calculationService.sumOfTwoNumbers(Integer.parseInt(first), Integer.parseInt(second),responseSum);
 if(sumcalc!=null){
    return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
 }
 else{
	 return new ResponseEntity<Boolean>(true,HttpStatus.BAD_REQUEST);
 }
 }  
  }

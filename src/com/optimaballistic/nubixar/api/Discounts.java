/*
* Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
ENum conteniendo las url de API nubixar
 */
package com.optimaballistic.nubixar.api;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author root
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Discounts{
	  private String name; 
	  private String type; 
	  private Double rate; 
	  private Double amount; 

	  public String getName(){
	  	return name; 
	  }
	  public void setName(String input){
	  	 this.name = input;
	  }
	  public String getType(){
	  	return type; 
	  }
	  public void setType(String input){
	  	 this.type = input;
	  }
	  public Double getRate(){
	  	return rate; 
	  }
	  public void setRate(Double input){
	  	 this.rate = input;
	  }
	  public Double getAmount(){
	  	return amount; 
	  }
	  public void setAmount(Double input){
	  	 this.amount = input;
	  }
}
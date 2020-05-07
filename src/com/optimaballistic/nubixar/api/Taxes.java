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
public class Taxes{
	  private String name; 
	  private String code; 
	  private String type; 
	  private double rate; 
	  private double amount; 
          private double base;

	  public String getName(){
	  	return name; 
	  }
	  public void setName(String input){
	  	 this.name = input;
	  }
	  public String getCode(){
	  	return code; 
	  }
	  public void setCode(String input){
	  	 this.code = input;
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
            public Double getBase(){
	  	return base; 
	  }
	  public void setBAse(Double input){
	  	 this.base = input;
	  }
}
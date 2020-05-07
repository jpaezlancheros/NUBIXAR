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
public class IsvMandante{
	  private String name; 
	  private String identification; 
	  private String digitCheck; 
	  private String identificationTypeCode; 

	  public String getName(){
	  	return name; 
	  }
	  public void setName(String input){
	  	 this.name = input;
	  }
	  public String getIdentification(){
	  	return identification; 
	  }
	  public void setIdentification(String input){
	  	 this.identification = input;
	  }
	  public String getDigitCheck(){
	  	return digitCheck; 
	  }
	  public void setDigitCheck(String input){
	  	 this.digitCheck = input;
	  }
	  public String getIdentificationTypeCode(){
	  	return identificationTypeCode; 
	  }
	  public void setIdentificationTypeCode(String input){
	  	 this.identificationTypeCode = input;
	  }
}
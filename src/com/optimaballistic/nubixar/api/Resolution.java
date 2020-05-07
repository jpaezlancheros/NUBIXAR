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
public class Resolution{
	  private String resolutionKey; 
	  private String resolutionPrefix; 
	  private Long resolutionNumber; 
	  private int resolutionRangeInitial; 
	  private int resolutionRangeFinal; 
	  private String resolutionValidFrom; 
	  private String resolutionValidUntil; 

	  public String getResolutionKey(){
	  	return resolutionKey; 
	  }
	  public void setResolutionKey(String input){
	  	 this.resolutionKey = input;
	  }
	  public String getResolutionPrefix(){
	  	return resolutionPrefix; 
	  }
	  public void setResolutionPrefix(String input){
	  	 this.resolutionPrefix = input;
	  }
	  public Long getResolutionNumber(){
	  	return resolutionNumber; 
	  }
	  public void setResolutionNumber(Long input){
	  	 this.resolutionNumber = input;
	  }
	  public int getResolutionRangeInitial(){
	  	return resolutionRangeInitial; 
	  }
	  public void setResolutionRangeInitial(int input){
	  	 this.resolutionRangeInitial = input;
	  }
	  public int getResolutionRangeFinal(){
	  	return resolutionRangeFinal; 
	  }
	  public void setResolutionRangeFinal(int input){
	  	 this.resolutionRangeFinal = input;
	  }
	  public String getResolutionValidFrom(){
	  	return resolutionValidFrom; 
	  }
	  public void setResolutionValidFrom(String input){
	  	 this.resolutionValidFrom = input;
	  }
	  public String getResolutionValidUntil(){
	  	return resolutionValidUntil; 
	  }
	  public void setResolutionValidUntil(String input){
	  	 this.resolutionValidUntil = input;
	  }
}
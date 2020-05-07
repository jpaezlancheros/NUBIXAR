/*
* Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
ENum conteniendo las url de API nubixar
 */
package com.optimaballistic.nubixar.api;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Totals{
	  private Double amount; 
	  private Double prepaymentAmount; 
          private Double taxesAmount; 
          private Double withholdingAmount;
           private Double discountsAmount;
          private Double  chargesAmount;

	  public Double getAmount(){
	  	return amount; 
	  }
	  public void setAmount(Double input){
	  	 this.amount = input;
	  }
	  public Double getPrepaymentAmount(){
	  	return prepaymentAmount; 
	  }
	  public void setPrepaymentAmount(Double input){
	  	 this.prepaymentAmount = input;
	  }
          public Double getTaxesAmount(){
	  	return taxesAmount; 
	  }
	  public void setTaxesAmount(Double input){
	  	 this.taxesAmount = input;
	  } 
          public Double getWithholdingAmount(){
	  	return withholdingAmount; 
	  }
	  public void setWithholdingAmount(Double input){
	  	 this.withholdingAmount = input;
	  }
           public Double getDiscountsAmount(){
	  	return discountsAmount;
	  }
	  public void setDiscountsAmount(Double input){
	  	 this.discountsAmount = input;
	  }
            public Double getChargesAmount(){
	  	return chargesAmount;
	  }
	  public void setChargesAmount(Double input){
	  	 this.chargesAmount = input;
	  }
}
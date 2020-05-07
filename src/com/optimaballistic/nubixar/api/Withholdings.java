/*
* Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
ENum conteniendo las url de API nubixar
 */
package com.optimaballistic.nubixar.api;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Withholdings {

    private String name;
    private String code;
    private String type;
    private int rate;
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String input) {
        this.name = input;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String input) {
        this.code = input;
    }

    public String getType() {
        return type;
    }

    public void setType(String input) {
        this.type = input;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int input) {
        this.rate = input;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int input) {
        this.amount = input;
    }
}

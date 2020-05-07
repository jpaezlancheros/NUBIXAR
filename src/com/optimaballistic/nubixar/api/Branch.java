/*
* Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
ENum conteniendo las url de API nubixar
 */
package com.optimaballistic.nubixar.api;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Branch {

    private String name;
    private String address;
    private String phone;
    private String countryCode;
    private String countryName;
    private String departamentCode;
    private String departamentName;
    private String cityCode;
    private String cityName;

    public String getName() {
        return name;
    }

    public void setName(String input) {
        this.name = input;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String input) {
        this.address = input;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String input) {
        this.phone = input;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String input) {
        this.countryCode = input;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String input) {
        this.countryName = input;
    }

    public String getDepartamentCode() {
        return departamentCode;
    }

    public void setDepartamentCode(String input) {
        this.departamentCode = input;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public void setDepartamentName(String input) {
        this.departamentName = input;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String input) {
        this.cityCode = input;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String input) {
        this.cityName = input;
    }
}

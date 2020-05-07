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
public class CustomFields {

    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String input) {
        this.key = input;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String input) {
        this.value = input;
    }
}

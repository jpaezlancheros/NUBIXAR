/*
* Optima Ballistic Corp 2011-2020 © 
* @author Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
 */
package com.optimaballistic.nubixar.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class utils {

    public static Invoice InvoiceFromJson(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Invoice u = mapper.readValue(json, Invoice.class);
            return u;
        } catch (IOException ex) {
            Logger.getLogger(testInvoice.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}

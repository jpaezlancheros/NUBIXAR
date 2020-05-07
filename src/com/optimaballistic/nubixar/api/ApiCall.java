/*
* Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
ENum conteniendo las url de API nubixar
 */
package com.optimaballistic.nubixar.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Consts;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Optima Ballistic Glass Corp
 */
public final class ApiCall {

    static String baseURL;

    /**
     * Envia un documento a la Dian
     *
     * @param type indica el tipo documento, InvoiceType CreditNoteType
     * DebitNoteType
     * @param json json Con la informacionn de la factura a enviar seugun la API
     * nubixar
     * @param token clave para acceso a la API nubixar
     * @param testSetId ID proporcionado por la Dian para enviar Habilitacion
     * @param version version de la API de Nubixar
     * @param mode modo habilitacion, operacion o test
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    private static void setBaseURL(boolean synchronous) {

        if (synchronous) {
            baseURL = APIURL.BASE_URL_SYNCHRONOUS;
        } else {
            baseURL = APIURL.BASE_URL;
        }
    }

    public static Invoice send(Invoice invoice, String token, String version) {
        Map<String, Object> result = send("InvoiceType", invoice.toJSON(), token, invoice.getTestSetId(), version, invoice.getMode(), false);
        try {
            invoice = com.optimaballistic.nubixar.api.utils.InvoiceFromJson((String) result.get("RESPONSE"));
            return invoice;
        } catch (Exception e) {
            return invoice;

        }
    }

    public static Map<String, Object> send(String type, String json, String token, String testSetId, String version, String mode) {
        return send(type, json, token, testSetId, version, mode, false);
    }

    public static Map<String, Object> send(String type, String json, String token, String testSetId, String version, String mode, boolean synchronous) {
        setBaseURL(synchronous);
    
        String apiUrl = "";
        if (version == null) {
            version = "1";
        }
        switch (type) {
            case "InvoiceType":
                System.out.println("case:" + type);
                switch (mode) {
                    case "habilitacion":
                        apiUrl = baseURL + APIURL.CREATE_INVOICE_HABILITACION.replace("{version}", version).replace("{testSetId}", testSetId);
                        break;
                    case "operacion":
                        apiUrl = baseURL + APIURL.CREATE_INVOICE_PRODUCTION.replace("{version}", version);
                        break;
                    case "test":
                        apiUrl = baseURL + APIURL.CREATE_INVOICE_TEST.replace("{version}", version);
                        break;
                }

                break;
            case "CreditNoteType":

                switch (mode) {
                    case "habilitacion":
                        apiUrl = baseURL + APIURL.CREATE_CREDIT_NOTE_HABILITACION.replace("{version}", version).replace("{testSetId}", testSetId);
                        break;
                    case "operacion":
                        apiUrl = baseURL + APIURL.CREATE_CREDIT_NOTE_PRODUCTION.replace("{version}", version);
                        break;
                    case "test":
                        apiUrl = baseURL + APIURL.CREATE_CREDIT_NOTE_TEST.replace("{version}", version);
                        break;
                }

                break;
            case "DebitNoteType":
                switch (mode) {
                    case "habilitacion":
                        apiUrl = baseURL + APIURL.CREATE_DEBIT_NOTE_HABILITACION.replace("{version}", version).replace("{testSetId}", testSetId);
                        break;
                    case "operacion":
                        apiUrl = baseURL + APIURL.CREATE_DEBIT_NOTE_PRODUCTION.replace("{version}", version);
                        break;
                    case "test":
                        apiUrl = baseURL + APIURL.CREATE_DEBIT_NOTE_TEST.replace("{version}", version);
                        break;
                }

                break;

        }
        System.out.println("apiURl:" + apiUrl);

        Map<String, Object> res;
        res = post(apiUrl, token, json);
        return res;

    }

    /**
     * Actualiza un documento ante la Dian
     *
     * @param type indica el tipo documento, InvoiceType CreditNoteType
     * DebitNoteType
     * @param json json Con la informacion del documento para generar xml
     * @param token clave para acceso a la API nubixar
     * @param testSetId testSetId de la DIan para envio en caso de habilitacion
     * @param version version de la API de Nubixar
     * @param id id del documento asignado por el proveedor tecnologico
     * @param mode modo habilitacion, operacion o test
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> update(String type, String json, String token, String testSetId, String id, String version, String mode) {
        return update(type, json, token, testSetId, id, version, mode, false);
    }

    public static Map<String, Object> update(String type, String json, String token, String testSetId, String id, String version, String mode, boolean synchronous) {
        String apiUrl = "";
        if (version == null) {
            version = "1";
        }

        setBaseURL(synchronous);

        switch (type) {
            case "InvoiceType":

                switch (mode) {
                    case "habilitacion":
                        apiUrl = baseURL + APIURL.UPDATE_INVOICE_HABILITACION.replace("{version}", version).replace("{testSetId}", testSetId).replace("{id}", id);
                        break;
                    case "operacion":
                        apiUrl = baseURL + APIURL.UPDATE_INVOICE_PRODUCTION.replace("{version}", version).replace("{id}", id);
                        break;
                    case "test":
                        apiUrl = baseURL + APIURL.UPDATE_INVOICE_TEST.replace("{version}", version).replace("{id}", id);
                        break;
                }

                break;
            case "CreditNoteType":

                switch (mode) {
                    case "habilitacion":
                        apiUrl = baseURL + APIURL.UPDATE_CREDIT_NOTE_HABILITACION.replace("{version}", version).replace("{testSetId}", testSetId).replace("{id}", id);
                        break;
                    case "operacion":
                        apiUrl = baseURL + APIURL.UPDATE_CREDIT_NOTE_PRODUCTION.replace("{version}", version).replace("{id}", id);
                        break;
                    case "test":
                        apiUrl = baseURL + APIURL.UPDATE_CREDIT_NOTE_TEST.replace("{version}", version).replace("{id}", id);
                        break;
                }

                break;
            case "DebitNoteType":
                switch (mode) {
                    case "habilitacion":
                        apiUrl = baseURL + APIURL.UPDATE_DEBIT_NOTE_HABILITACION.replace("{version}", version).replace("{testSetId}", testSetId).replace("{id}", id);
                        break;
                    case "operacion":
                        apiUrl = baseURL + APIURL.UPDATE_DEBIT_NOTE_PRODUCTION.replace("{version}", version).replace("{id}", id);
                        break;
                    case "test":
                        apiUrl = baseURL + APIURL.UPDATE_DEBIT_NOTE_TEST.replace("{version}", version).replace("{id}", id);
                        break;
                }

                break;

        }

        Map<String, Object> res;
        res = put(apiUrl, token, json);
        return res;

    }

    /**
     * Recupera la informacion de un documento en la api nubixar
     *
     * @param type indica el tipo documento, InvoiceType CreditNoteType
     * DebitNoteType
     * @param token clave para acceso a la API nubixar
     * @param id id del documento asignado por el proveedor tecnologico
     * @param version version de la API de Nubixar
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> get(String type, String token, String id, String version) {
        return get(type, token, id, version, false);
    }

    public static Map<String, Object> get(String type, String token, String id, String version, boolean synchronous) {
        String apiUrl = "";
        if (version == null) {
            version = "1";
        }

        setBaseURL(synchronous);

        switch (type) {
            case "InvoiceType":
                apiUrl = baseURL + APIURL.GET_INVOICE.replace("{version}", version).replace("{id}", id);
                break;
            case "CreditNoteType":
                apiUrl = baseURL + APIURL.GET_CREDIT_NOTE.replace("{version}", version).replace("{id}", id);
                break;
            case "DebitNoteType":
                apiUrl = baseURL + APIURL.GET_DEBIT_NOTE.replace("{version}", version).replace("{id}", id);
                break;

        }
        Map<String, Object> res;
        res = get(apiUrl, token);
        return res;

    }

    public static Map<String, Object> getResolution(String token, String version, boolean synchronous) {

        if (version == null) {
            version = "1";
        }

        setBaseURL(synchronous);

        String apiUrl = baseURL + APIURL.GET_RESOLUTION.replace("{version}", version);

        Map<String, Object> res;
        res = get(apiUrl, token);
        return res;

    }

    /**
     * Regenera el Pdf en el proveedor Tecnologico
     *
     * @param type indica el tipo documento, InvoiceType CreditNoteType
     * DebitNoteType
     * @param token clave para acceso a la API nubixar
     * @param id id del documento asignado por el proveedor tecnologico
     * @param version version de la API de Nubixar
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> patchPdf(String type, String token, String id, String version) {
        return patchPdf(type, token, id, version, false);
    }

    public static Map<String, Object> patchPdf(String type, String token, String id, String version, boolean synchronous) {
        String apiUrl = "";
        if (version == null) {
            version = "1";
        }

        setBaseURL(synchronous);

        switch (type) {
            case "InvoiceType":
                apiUrl = baseURL + APIURL.PATCH_INVOICE_PDF.replace("{version}", version).replace("{id}", id);
                break;
            case "CreditNoteType":
                apiUrl = baseURL + APIURL.PATCH_CREDIT_NOTE_PDF.replace("{version}", version).replace("{id}", id);
                break;
            case "DebitNoteType":
                apiUrl = baseURL + APIURL.PATCH_DEBIT_NOTE_PDF.replace("{version}", version).replace("{id}", id);
                break;

        }
        Map<String, Object> res;
        res = patch(apiUrl, token);
        return res;

    }

    /**
     * Reenvia la factura al Cliente
     *
     * @param type indica el tipo documento, InvoiceType CreditNoteType
     * DebitNoteType
     * @param token clave para acceso a la API nubixar
     * @param id id del documento asignado por el proveedor tecnologico
     * @param version version de la API de Nubixar
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> patchSend(String type, String token, String id, String version) {
        return patchSend(type, token, id, version, false);
    }

    public static Map<String, Object> patchSend(String type, String token, String id, String version, boolean synchronous) {
        String apiUrl = "";
        if (version == null) {
            version = "1";
        }

        setBaseURL(synchronous);

        switch (type) {
            case "InvoiceType":
                apiUrl = baseURL + APIURL.PATCH_INVOICE_PDF_SEND.replace("{version}", version).replace("{id}", id);
                break;
            case "CreditNoteType":
                apiUrl = baseURL + APIURL.PATCH_CREDIT_NOTE_PDF_SEND.replace("{version}", version).replace("{id}", id);
                break;
            case "DebitNoteType":
                apiUrl = baseURL + APIURL.PATCH_DEBIT_NOTE_PDF_SEND.replace("{version}", version).replace("{id}", id);
                break;

        }
        Map<String, Object> res;
        res = patch(apiUrl, token);
        return res;

    }

    /**
     * Recupera la informacion de un documento por el consecutivo
     *
     * @param type indica el tipo documento, InvoiceType CreditNoteType
     * DebitNoteType
     * @param token clave para acceso a la API nubixar
     * @param consecutive
     * @param version version de la API de Nubixar
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> getbyConsecutive(String type, String token, String consecutive, String version) {
        return getbyConsecutive(type, token, consecutive, version, false);
    }

    public static Map<String, Object> getbyConsecutive(String type, String token, String consecutive, String version, boolean synchronous) {
        String apiUrl = "";
        if (version == null) {
            version = "1";
        }
        setBaseURL(synchronous);

        switch (type) {
            case "InvoiceType":
                apiUrl = baseURL + APIURL.GET_INVOICE_BY_CONSECUTIVE.replace("{version}", version).replace("{consecutive}", consecutive);
                break;
            case "CreditNoteType":
                apiUrl = baseURL + APIURL.GET_CREDIT_NOTE_BY_CONSECUTIVE.replace("{version}", version).replace("{consecutive}", consecutive);
                break;
            case "DebitNoteType":
                apiUrl = baseURL + APIURL.GET_DEBIT_NOTE_BY_CONSECUTIVE.replace("{version}", version).replace("{consecutive}", consecutive);
                break;

        }
        Map<String, Object> res;
        res = get(apiUrl, token);
        return res;

    }

    /**
     * Recupera lista de coumentos por ano
     *
     * @param type indica el tipo documento, InvoiceType CreditNoteType
     * DebitNoteType
     * @param token clave para acceso a la API nubixar
     * @param year ano
     * @param version version de la API de Nubixar
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> findByYear(String type, String token, String year, String version) {
        return findByYear(type, token, year, version, false);
    }

    public static Map<String, Object> findByYear(String type, String token, String year, String version, boolean synchronous) {
        String apiUrl = "";
        if (version == null) {
            version = "1";
        }
        setBaseURL(synchronous);

        switch (type) {
            case "InvoiceType":
                apiUrl = baseURL + APIURL.GET_INVOICE_BY_YEAR.replace("{version}", version).replace("{year}", year);
                break;
            case "CreditNoteType":
                apiUrl = baseURL + APIURL.GET_CREDIT_NOTE_BY_YEAR.replace("{version}", version).replace("{year}", year);
                break;
            case "DebitNoteType":
                apiUrl = baseURL + APIURL.GET_DEBIT_NOTE_BY_YEAR.replace("{version}", version).replace("{year}", year);
                break;

        }
        Map<String, Object> res;
        res = get(apiUrl, token);
        return res;

    }

    /**
     * Recupera documentos por ano
     *
     * @param type indica el tipo documento, InvoiceType CreditNoteType
     * DebitNoteType
     * @param token clave para acceso a la API nubixar
     * @param year ano
     * @param version version de la API de Nubixar
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> findDashBoardByYear(String type, String token, String year, String version) {
        return findDashBoardByYear(type, token, year, version, false);
    }

    public static Map<String, Object> findDashBoardByYear(String type, String token, String year, String version, boolean synchronous) {
        String apiUrl = "";
        if (version == null) {
            version = "1";
        }
        setBaseURL(synchronous);

        switch (type) {
            case "InvoiceType":
                apiUrl = baseURL + APIURL.GET_INVOICE_DASHBOARD_BY_YEAR.replace("{version}", version).replace("{reportYear}", year);
                break;
            case "CreditNoteType":
                apiUrl = baseURL + APIURL.GET_CREDIT_NOTE_DASHBOARD_BY_YEAR.replace("{version}", version).replace("{reportYear}", year);
                break;
            case "DebitNoteType":
                apiUrl = baseURL + APIURL.GET_DEBIT_NOTE_DASHBOARD_BY_YEAR.replace("{version}", version).replace("{reportYear}", year);
                break;

        }
        Map<String, Object> res;
        res = get(apiUrl, token);
        return res;

    }

    /**
     * Recupera lista documentos por rango
     *
     * @param type indica el tipo documento, InvoiceType CreditNoteType
     * DebitNoteType
     * @param token clave para acceso a la API nubixar
     * @param dateStart fecha incio
     * @param dateEnd gfecha fin
     * @param version version de la API de Nubixar
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> findByRange(String type, String token, String dateStart, String dateEnd, String version) {
        return findByRange(type, token, dateStart, dateEnd, version, false);
    }

    public static Map<String, Object> findByRange(String type, String token, String dateStart, String dateEnd, String version, boolean synchronous) {
        String apiUrl = "";
        if (version == null) {
            version = "1";
        }
        setBaseURL(synchronous);

        switch (type) {
            case "InvoiceType":
                apiUrl = baseURL + APIURL.GET_INVOICE_BY_RANGE.replace("{version}", version).replace("{dateStart}", dateStart).replace("{dateEnd}", dateEnd);
                break;
            case "CreditNoteType":
                apiUrl = baseURL + APIURL.GET_CREDIT_NOTE_BY_RANGE.replace("{version}", version).replace("{dateStart}", dateStart).replace("{dateEnd}", dateEnd);
                break;
            case "DebitNoteType":
                apiUrl = baseURL + APIURL.GET_DEBIT_NOTE_BY_RANGE.replace("{version}", version).replace("{dateStart}", dateStart).replace("{dateEnd}", dateEnd);
                break;

        }
        Map<String, Object> res;
        res = get(apiUrl, token);
        return res;

    }

    /**
     * Recupera lista documentos por fano y mes
     *
     * @param type indica el tipo documento, InvoiceType CreditNoteType
     * DebitNoteType
     * @param token clave para acceso a la API nubixar
     * @param year ano
     * @param month mes
     * @param version version de la API de Nubixar
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> findByYearMonth(String type, String token, String year, String month, String version) {
        return findByYearMonth(type, token, year, month, version, false);
    }

    public static Map<String, Object> findByYearMonth(String type, String token, String year, String month, String version, boolean synchronous) {
        String apiUrl = "";

        if (version == null) {
            version = "1";
        }

        setBaseURL(synchronous);

        switch (type) {
            case "InvoiceType":
                apiUrl = baseURL + APIURL.GET_INVOICE_BY_YEAR_MONTH.replace("{version}", version).replace("{year}", year).replace("{month}", month);
                break;
            case "CreditNoteType":
                apiUrl = baseURL + APIURL.GET_CREDIT_NOTE_BY_YEAR_MONTH.replace("{version}", version).replace("{year}", year).replace("{month}", month);
                break;
            case "DebitNoteType":
                apiUrl = baseURL + APIURL.GET_DEBIT_NOTE_BY_YEAR_MONTH.replace("{version}", version).replace("{year}", year).replace("{month}", month);
                break;

        }
        Map<String, Object> res;
        res = get(apiUrl, token);
        return res;

    }

    /**
     * Ejecuta un request POST a nubixar
     *
     * @param apiUrl url desgnada por nubixar para el request
     * @param token clave para acceso a la API nubixar
     * @param json json con la informacion a enviar en el body
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> post(String apiUrl, String token, String json) {
        Map<String, Object> res;
        res = new HashMap<>();
     
        try {

            int responseCode;
            String result;
            try (CloseableHttpClient client = getClient()) {
                HttpPost httpPost = new HttpPost(apiUrl);
             
                StringEntity entity = new StringEntity(json, ContentType.create("application/json", Consts.UTF_8));
                httpPost.setEntity(entity);
                httpPost.setHeader("Accept", "application/json");
                httpPost.setHeader("Content-type", "application/json");
                httpPost.setHeader("x-api-key", token);
                CloseableHttpResponse response = client.execute(httpPost);
                responseCode = response.getStatusLine().getStatusCode();
                result = EntityUtils.toString(response.getEntity());
      
                System.out.println(result);
                System.out.println(httpPost.getRequestLine().toString());
            }

            res.put("RESPONSE_CODE", result);

            if (responseCode == HttpURLConnection.HTTP_OK) { //success

                res.put("RESPONSE_CODE", responseCode);
                res.put("RESPONSE", result);
                res.put("RESPONSE_MESSAGE", result);

            } else {
                res.put("RESPONSE", result);
                res.put("RESPONSE_CODE", responseCode);
                res.put("RESPONSE_MESSAGE", result);
                //success

                // print result
                res.put("ERROR", result);
                System.out.println("POST NOT WORKED");

            }

        } catch (MalformedURLException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return res;
    }

    /**
     * Ejecuta un request PUT a nubixar
     *
     * @param apiUrl url desgnada por nubixar para el request
     * @param token clave para acceso a la API nubixar
     * @param json json con la informacion a enviar en el body
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> put(String apiUrl, String token, String json) {
        Map<String, Object> res;
        res = new HashMap<>();
   
        try {

            int responseCode;
            String result;
            try (CloseableHttpClient client = getClient()) {
                HttpPut request = new HttpPut(apiUrl);
             
                StringEntity entity = new StringEntity(json, ContentType.create("application/json", Consts.UTF_8));
                request.setEntity(entity);
                request.setHeader("Accept", "application/json");
                request.setHeader("Content-type", "application/json");
                request.setHeader("x-api-key", token);
                CloseableHttpResponse response = client.execute(request);
                responseCode = response.getStatusLine().getStatusCode();
                result = EntityUtils.toString(response.getEntity());
             
            }

            res.put("RESPONSE_CODE", result);

            if (responseCode == HttpURLConnection.HTTP_OK) { //success

                res.put("RESPONSE_CODE", responseCode);
                res.put("RESPONSE", result);
                res.put("RESPONSE_MESSAGE", result);

            } else {
                res.put("RESPONSE", result);
                res.put("RESPONSE_CODE", responseCode);
                res.put("RESPONSE_MESSAGE", result);
                //success

                // print result
                res.put("ERROR", result);
             

            }

        } catch (MalformedURLException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return res;
    }

    /**
     * Ejecuta un request get a nubixar
     *
     * @param apiUrl url desgnada por nubixar para el request
     * @param token clave para acceso a la API nubixar
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> get(String apiUrl, String token) {
        Map<String, Object> res;
        res = new HashMap<>();
       
        try {

            int responseCode;
            String result;
            try (CloseableHttpClient client = getClient()) {
                HttpGet request = new HttpGet(apiUrl);
                request.setHeader("Accept", "application/json");
                request.setHeader("Content-type", "application/json");
                request.setHeader("x-api-key", token);
                CloseableHttpResponse response = client.execute(request);
                responseCode = response.getStatusLine().getStatusCode();
                if (response.getEntity() != null) {
                    result = EntityUtils.toString(response.getEntity());
                } else {
                    result = "no results";
                }
                System.out.println(responseCode);
                System.out.println(result);
                System.out.println(request.getRequestLine().toString());
            }

            res.put("RESPONSE_CODE", result);

            if (responseCode == HttpURLConnection.HTTP_OK) { //success

                res.put("RESPONSE_CODE", responseCode);
                res.put("RESPONSE", result);
                res.put("RESPONSE_MESSAGE", result);

            } else {
                res.put("RESPONSE", result);
                res.put("RESPONSE_CODE", responseCode);
                res.put("RESPONSE_MESSAGE", result);
                //success

                // print result
                res.put("ERROR", result);
             

            }

        } catch (MalformedURLException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return res;
    }

    /**
     * Ejecuta un request PATCH a nubixar
     *
     * @param apiUrl url desgnada por nubixar para el request
     * @param token clave para acceso a la API nubixar
     * @return devuelve un Map, con la "RESPONSE":respuesta;
     * "RESPONSE_CODE":codigo HTTP de la respuesta a la peticion; "ERROR":
     * descripcion del error recibido
     */
    public static Map<String, Object> patch(String apiUrl, String token) {
        Map<String, Object> res;
        res = new HashMap<>();
        System.out.println("Start API post Request");
        try {

            int responseCode;
            String result;
            try (CloseableHttpClient client = getClient()) {
                HttpPatch request = new HttpPatch(apiUrl);
                request.setHeader("Accept", "application/json");
                request.setHeader("Content-type", "application/json");
                request.setHeader("x-api-key", token);
                CloseableHttpResponse response = client.execute(request);
                responseCode = response.getStatusLine().getStatusCode();
                if (response.getEntity() != null) {
                    result = EntityUtils.toString(response.getEntity());
                } else {
                    result = "no results";
                }
      
            }

            res.put("RESPONSE_CODE", result);

            if (responseCode == HttpURLConnection.HTTP_OK) { //success

                res.put("RESPONSE_CODE", responseCode);
                res.put("RESPONSE", result);
                res.put("RESPONSE_MESSAGE", result);

            } else {
                res.put("RESPONSE", result);
                res.put("RESPONSE_CODE", responseCode);
                res.put("RESPONSE_MESSAGE", result);
                //success

                // print result
                res.put("ERROR", result);
              

            }

        } catch (MalformedURLException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return res;
    }

    /**
     * Crea un cliente para conexion http
     */
    private static CloseableHttpClient getClient() {

        UnsafeSSLHelper unsafeSSLHelper = new UnsafeSSLHelper();
        CloseableHttpClient client = HttpClientBuilder.create().setSslcontext(unsafeSSLHelper.createUnsecureSSLContext()).setHostnameVerifier(unsafeSSLHelper.getPassiveX509HostnameVerifier()).build();

        return client;

    }

}

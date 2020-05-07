/*
* Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
ENum conteniendo las url de API nubixar
 */
package com.optimaballistic.nubixar.api;

public final class APIURL {

    public static final String BASE_URL = "https://cloud.nubixar.com";
    public static final String BASE_URL_SYNCHRONOUS = "https://api.nubixar.app";
    public static final String CREATE_INVOICE_HABILITACION = "/api/v{version}/public/documents/invoice/habilitation/{testSetId}";
    public static final String CREATE_INVOICE_PRODUCTION = "/api/v{version}/public/documents/invoice";
    public static final String CREATE_INVOICE_TEST = "/api/v{version}/public/documents/invoice/test";
    public static final String UPDATE_INVOICE_HABILITACION = "/api/v{version}/public/documents/invoice/habilitation/{testSetId}/{id}";
    public static final String UPDATE_INVOICE_PRODUCTION = "/api/v{version}/public/documents/invoice/{id}";
    public static final String UPDATE_INVOICE_TEST = "/api/v{version}/public/documents/invoice/test/{id}";
    public static final String GET_INVOICE = "/api/v{version}/public/documents/invoices/{id}";
    public static final String GET_INVOICE_BY_CONSECUTIVE = "/api/v{version}/public/documents/invoices/{consecutive}/findByConsecutive";
    public static final String GET_INVOICE_BY_YEAR = "/api/v{version}/public/documents/invoices/{consecutive}/findByConsecutive";
    public static final String GET_INVOICE_BY_YEAR_MONTH = "/api/v{version}/public/documents/invoices/{year}/{month}/findByYearByMonth";
    public static final String GET_INVOICE_BY_RANGE = "/api/v{version}/public/documents/invoices/{dateStart}/{dateEnd}/findByDateRanges";
    public static final String CREATE_DEBIT_NOTE_HABILITACION = "/api/v{version}/public/documents/notes-db/habilitation/{testSetId}";
    public static final String CREATE_DEBIT_NOTE_PRODUCTION = "/api/v{version}/public/documents/notes-db";
    public static final String CREATE_DEBIT_NOTE_TEST = "/api/v{version}/public/documents/notes-db/test";
    public static final String UPDATE_DEBIT_NOTE_HABILITACION = "/api/v{version}/public/documents/notes-db/habilitation/{testSetId}/{id}";
    public static final String UPDATE_DEBIT_NOTE_PRODUCTION = "/api/v{version}/public/documents/notes-db/{id}";
    public static final String UPDATE_DEBIT_NOTE_TEST = "/api/v{version}/public/documents/notes-db/test/{id}";
    public static final String GET_DEBIT_NOTE = "/api/v{version}/public/documents/notes-db/{id}";
    public static final String GET_DEBIT_NOTE_BY_CONSECUTIVE = "/api/v{version}/public/documents/notes-db/{consecutive}/findByConsecutive";
    public static final String GET_DEBIT_NOTE_BY_YEAR = "/api/v{version}/public/documents/notes-db/{year}/findByYear";
    public static final String GET_DEBIT_NOTE_BY_YEAR_MONTH = "/api/v{version}/public/documents/notes-db/{year}/{month}/findByYearByMonth";
    public static final String GET_DEBIT_NOTE_BY_RANGE = "/api/v{version}/public/documents/notes-db/{dateStart}/{dateEnd}/findByDateRanges";
    public static final String CREATE_CREDIT_NOTE_HABILITACION = "/api/v{version}/public/documents/notes-cr/habilitation/{testSetId}";
    public static final String CREATE_CREDIT_NOTE_PRODUCTION = "/api/v{version}/public/documents/notes-cr";
    public static final String CREATE_CREDIT_NOTE_TEST = "/api/v{version}/public/documents/notes-cr/test";
    public static final String UPDATE_CREDIT_NOTE_HABILITACION = "/api/v{version}/public/documents/notes-cr/habilitation/{testSetId}/{id}";
    public static final String UPDATE_CREDIT_NOTE_PRODUCTION = "/api/v{version}/public/documents/notes-cr/{id}";
    public static final String UPDATE_CREDIT_NOTE_TEST = "/api/v{version}/public/documents/notes-cr/test/{id}";
    public static final String GET_CREDIT_NOTE = "/api/v{version}/public/documents/notes-cr/{id}";
    public static final String GET_CREDIT_NOTE_BY_CONSECUTIVE = "/api/v{version}/public/documents/notes-cr/{consecutive}/findByConsecutive";
    public static final String GET_CREDIT_NOTE_BY_YEAR = "/api/v{version}/public/documents/notes-cr/{year}/findByYear";
    public static final String GET_CREDIT_NOTE_BY_YEAR_MONTH = "/api/v{version}/public/documents/notes-cr/{year}/{month}/findByYearByMonth";
    public static final String GET_CREDIT_NOTE_BY_RANGE = "/api/v{version}/public/documents/notes-cr/{dateStart}/{dateEnd}/findByDateRanges";
    public static final String GET_INVOICE_DASHBOARD_BY_YEAR = "/api/v{version}/public/documents/invoices/{reportYear}/dashboardByYear";
    public static final String GET_DEBIT_NOTE_DASHBOARD_BY_YEAR = "/api/v{version}/public/documents/notes-db/{reportYear}/dashboardByYear";
    public static final String GET_CREDIT_NOTE_DASHBOARD_BY_YEAR = "/api/v{version}/public/documents/notes-cr/{reportYear}/dashboardByYear";
    public static final String PATCH_CREDIT_NOTE_PDF = "/api/v{version}/public/documents/notes-cr/{id}/pdf";
    public static final String PATCH_DEBIT_NOTE_PDF = "/api/v{version}/public/documents/notes-db/{id}/pdf";
    public static final String PATCH_INVOICE_PDF = "/api/v{version}/public/documents/invoices/{id}/pdf";
    public static final String PATCH_INVOICE_PDF_SEND = "/api/v{version}/public/documents/invoices/{id}/pdf/send";
    public static final String PATCH_CREDIT_NOTE_PDF_SEND = "/api/v{version}/public/documents/notes-cr/{id}/pdf/send";
    public static final String PATCH_DEBIT_NOTE_PDF_SEND = "/api/v{version}/public/documents/notes-db/{id}/pdf/send";
    public static final String GET_TEST_URL_NOTIFICATION = "/api/v{version}/public/documents/testUrlNotification";
    public static final String GET_RESOLUTION = "/api/v{version}/public/documents/resolutions";

}

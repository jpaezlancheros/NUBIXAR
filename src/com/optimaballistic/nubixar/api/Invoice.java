/*
* Optima Ballistic Corp 2011-2020 © 
* @author Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
 */
package com.optimaballistic.nubixar.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
@JsonInclude(Include.NON_NULL)
public class Invoice {

    private String id;
    private String code;
    private String mode;
    private String testSetId;
    private String prefix;
    private String status;
    private String statusDate;
    private String cufe;
    private String qr;
    private String urlPdf;
    private String urlXmlDocument;
    private String urlXmlDocumentZip;
    private String urlXmlApplicationResponse;
    private String urlXmlAttachedDocument;
    private String dianDeliveryStatus;
    private String dianState;
    private List<String> dianStateReason;
    private String dianStateDate;
    private Boolean sentEmail;
    private String sentEmailAt;
    private String rejectReason;
    private Boolean hasNotesDb;
    private Boolean hasNotesCr;
    private String createdAt;
    private String updatedAt;
    private Boolean isDue;
    private String sequence;
    private String format;
    private String emailSender;
    private int consecutive;
    private String externalNumber;
    private String currencyCode;
    private Double currencyRate;
    private String date;
    private String dateDue;
    private String dateStart;
    private String dateEnd;
    private String typeOfOperation;
    private String incoterms;
    private String deliveryTerms;
    private String terms;
    private String remark;
    private String observation;

    private int termDay;
    private String paymentMeanCode;
    private Branch branch;
    private Resolution resolution;
    private Customer customer;
    private List<InvoiceDetails> invoiceDetails = new ArrayList<>();
    private Totals totals;
    private List<Discounts> discounts;
    private List<Charges> charges;
    private List<CustomFields> customFields;

    public void Invoice() {

    }

    public String getId() {
        return id;
    }

    public void setId(String input) {
        this.id = input;
    }

    public String getTestSetId() {
        return testSetId;
    }

    public void setTestSetId(String input) {
        this.testSetId = input;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String input) {
        this.prefix = input;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String input) {
        this.status = input;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String input) {
        this.statusDate = input;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String input) {
        this.statusDate = input;
    }

    public String getCufe() {
        return cufe;
    }

    public void setCufe(String input) {
        this.cufe = input;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String input) {
        this.mode = input;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String input) {
        this.code = input;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String input) {
        this.format = input;
    }

    public String getEmailSender() {
        return emailSender;
    }

    public void setEmailSender(String input) {
        this.emailSender = input;
    }

    public int getConsecutive() {
        return consecutive;
    }

    public void setConsecutive(int input) {
        this.consecutive = input;
    }

    public String getExternalNumber() {
        return externalNumber;
    }

    public void setExternalNumber(String input) {
        this.externalNumber = input;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String input) {
        this.currencyCode = input;
    }

    public Double getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(Double input) {
        this.currencyRate = input;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String input) {
        this.date = input;
    }

    public String getDateDue() {
        return dateDue;
    }

    public void setDateDue(String input) {
        this.dateDue = input;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String input) {
        this.dateStart = input;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String input) {
        this.dateEnd = input;
    }

    public String getTypeOfOperation() {
        return typeOfOperation;
    }

    public void setTypeOfOperation(String input) {
        this.typeOfOperation = input;
    }

    public String getIncoterms() {
        return incoterms;
    }

    public void setIncoterms(String input) {
        this.incoterms = input;
    }

    public String getDeliveryTerms() {
        return deliveryTerms;
    }

    public void setDeliveryTerms(String input) {
        this.deliveryTerms = input;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String input) {
        this.terms = input;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String input) {
        this.remark = input;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String input) {
        this.observation = input;
    }

    public String getSentEmailAt() {
        return sentEmailAt;
    }

    public void setSentEmailAt(String input) {
        this.sentEmailAt = input;
    }

    public int getTermDay() {
        return termDay;
    }

    public void setTermDay(int input) {
        this.termDay = input;
    }

    public String getPaymentMeanCode() {
        return paymentMeanCode;
    }

    public void setPaymentMeanCode(String input) {
        this.paymentMeanCode = input;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch input) {
        this.branch = input;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution input) {
        this.resolution = input;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer input) {
        this.customer = input;
    }

    public List<InvoiceDetails> getInvoiceDetails() {
        return invoiceDetails;
    }

    public void setInvoiceDetails(List<InvoiceDetails> input) {
        this.invoiceDetails = input;
    }

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals input) {
        this.totals = input;
    }

    public List<Discounts> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discounts> input) {
        this.discounts = input;
    }

    public List<Charges> getCharges() {
        return charges;
    }

    public void setCharges(List<Charges> input) {
        this.charges = input;
    }

    public List<CustomFields> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomFields> input) {
        this.customFields = input;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String input) {
        this.qr = input;
    }

    public String getUrlPdf() {
        return urlPdf;
    }

    public void setUrlPdf(String input) {
        this.urlPdf = input;
    }

    public String getUrlXmlDocument() {
        return urlXmlDocument;
    }

    public void setUrlXmlDocument(String input) {
        this.urlXmlDocument = input;
    }

    public String getUrlXmlDocumentZip() {
        return urlXmlDocumentZip;
    }

    public void setUrlXmlDocumentZip(String input) {
        this.urlXmlDocumentZip = input;
    }

    public String getUrlXmlApplicationResponse() {
        return urlXmlApplicationResponse;
    }

    public void setUrlXmlApplicationResponse(String input) {
        this.urlXmlApplicationResponse = input;
    }

    public String geturlXmlAttachedDocument() {
        return urlXmlAttachedDocument;
    }

    public void setUrlXmlAttachedDocument(String input) {
        this.urlXmlAttachedDocument = input;
    }

    public String getDianDeliveryStatus() {
        return dianDeliveryStatus;
    }

    public void setDianDeliveryStatus(String input) {
        this.dianDeliveryStatus = input;
    }

    public String getDianState() {
        return dianState;
    }

    public void setDianState(String input) {
        this.dianState = input;
    }

    public List<String> getDianStateReason() {
        return dianStateReason;
    }

    public void setDianStateReason(List<String> input) {
        this.dianStateReason = input;
    }

    public String getDianStateDate() {
        return dianStateDate;
    }

    public void setDianStateDate(String input) {
        this.dianStateDate = input;
    }

    public Boolean getSentEmail() {
        return sentEmail;
    }

    public void setSentEmail(Boolean input) {
        this.sentEmail = input;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String input) {
        this.rejectReason = input;
    }

    public Boolean getHasNotesDb() {
        return hasNotesDb;
    }

    public void setHasNotesDb(Boolean input) {
        this.hasNotesDb = input;
    }

    public Boolean getHasNotesCr() {
        return hasNotesCr;
    }

    public void setHasNotesCr(Boolean input) {
        this.hasNotesCr = input;
    }

    public Boolean getIsDue() {
        return isDue;
    }

    public void setIsDue(Boolean input) {
        this.isDue = input;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String input) {
        this.createdAt = input;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String input) {
        this.updatedAt = input;
    }

    public String toJSON() {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";
        try {
            jsonString = mapper.writeValueAsString(this);
        } catch (IOException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jsonString;

    }

}

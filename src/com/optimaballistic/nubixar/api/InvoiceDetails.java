/*
* Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
ENum conteniendo las url de API nubixar
 */
package com.optimaballistic.nubixar.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 *
 * @author root
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoiceDetails {

    private String standardType;
    private String standardCode;
    private String itemCode;
    private String itemName;
    private String itemModel;
    private String description;
    private String brandName;
    private String itemCodeSupplier;
    private Boolean isPresent;
    private String unitMeasurementCode;
    private String unitMeasurementName;
    private Double price;
    private Double quantity;
    private Double discountAmount;
    private Double chargeAmount;
    private Double subTotal;
    private Double priceWithAllowanceCharge;
    private Double totalWithAllowanceCharge;
    private List<Discounts> discounts;
    private List<Charges> charges;
    private List<Taxes> taxes;
    private List<Withholdings> withholdings;
    private IsvMandante isvMandante;

    public String getStandardType() {
        return standardType;
    }

    public void setStandardType(String input) {
        this.standardType = input;
    }

    public String getStandardCode() {
        return standardCode;
    }

    public void setStandardCode(String input) {
        this.standardCode = input;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String input) {
        this.itemCode = input;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String input) {
        this.itemName = input;
    }

    public String getItemModel() {
        return itemModel;
    }

    public void setItemModel(String input) {
        this.itemModel = input;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String input) {
        this.description = input;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String input) {
        this.brandName = input;
    }

    public String getItemCodeSupplier() {
        return itemCodeSupplier;
    }

    public void setItemCodeSupplier(String input) {
        this.itemCodeSupplier = input;
    }

    public boolean getIsPresent() {
        return isPresent;
    }

    public void setIsPresent(boolean input) {
        this.isPresent = input;
    }

    public String getUnitMeasurementCode() {
        return unitMeasurementCode;
    }

    public void setUnitMeasurementCode(String input) {
        this.unitMeasurementCode = input;
    }

    public String getUnitMeasurementName() {
        return unitMeasurementName;
    }

    public void setUnitMeasurementName(String input) {
        this.unitMeasurementName = input;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double input) {
        this.price = input;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double input) {
        this.quantity = input;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double input) {
        this.discountAmount = input;
    }

    public Double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Double input) {
        this.chargeAmount = input;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double input) {
        this.subTotal = input;
    }

    public Double getPriceWithAllowanceCharge() {
        return priceWithAllowanceCharge;
    }

    public void setPriceWithAllowanceCharge(Double input) {
        this.priceWithAllowanceCharge = input;
    }

    public Double getTotalWithAllowanceCharge() {
        return totalWithAllowanceCharge;
    }

    public void setTotalWithAllowanceCharge(Double input) {
        this.totalWithAllowanceCharge = input;
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

    public List<Taxes> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Taxes> input) {
        this.taxes = input;
    }

    public List<Withholdings> getWithholdings() {
        return withholdings;
    }

    public void setWithholdings(List<Withholdings> input) {
        this.withholdings = input;
    }

    public IsvMandante getIsvMandante() {
        return isvMandante;
    }

    public void setIsvMandante(IsvMandante input) {
        this.isvMandante = input;
    }
}

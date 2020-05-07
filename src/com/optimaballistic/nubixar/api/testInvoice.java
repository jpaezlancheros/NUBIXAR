/*
* Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
ENum conteniendo las url de API nubixar
 */
package com.optimaballistic.nubixar.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class testInvoice {

    public static void main(String args[]) {
        Invoice invoice;
        invoice = new Invoice();
        invoice.setCode("a");

        InvoiceDetails n = new InvoiceDetails();
        n.setBrandName("OPTIMA");
        n.setItemCode("AAAA");
        n.setPrice(200.0);
        n.setIsPresent(false);
        
        
        invoice.getInvoiceDetails().add(n);
        System.out.println(invoice.toJSON());
        
        String a="{\"date\":\"2019-12-20T08:03:17-05:00\",\"dateDue\":\"2019-12-20T23:59:59-05:00\",\"incoterms\":\"DDP\",\"deliveryTerms\":\"DDP BOGOTÁ;VIA/WAY:TERRESTRE;100% CON LA ORDEN;\",\"code\":\"01\",\"externalNumber\":\"\",\"observation\":\"-\",\"customFields\":[{\"value\":6594,\"key\":\"invoiceId\"}],\"format\":\"FacturaExportacion\",\"remark\":\"Responsable IVA, Actividad Economica 2310 Tarifa 7 x1000\",\"dateEnd\":\"\",\"totals\":{\"prepaymentAmount\":0,\"amount\":9500000},\"resolution\":{\"resolutionNumber\":18760000001,\"resolutionRangeFinal\":\"5000000\",\"resolutionValidFrom\":\"2019-01-19\",\"resolutionKey\":\"fc8eac422eba16e22ffd8c6f94b3f40a6e38162c\",\"resolutionPrefix\":\"SETT\",\"resolutionRangeInitial\":\"1\",\"resolutionValidUntil\":\"2030-01-19\"},\"consecutive\":\"200\",\"dateStart\":\"\",\"terms\":\"FOB $:9500000.00;\\nPESO BRUTO/NET WEIGHT:0.0;\\nPzs/Pcs:8;\\nCAJAS/BOXES:0;\\n\",\"termDay\":0,\"typeOfOperation\":\"10\",\"currencyRate\":\"1\",\"invoiceDetails\":[{\"brandName\":\"Optima\",\"quantity\":\"1.00\",\"itemCode\":\"OFC-03860-0\",\"description\":\"PARABRISAS GRIS CLARO\",\"isPresent\":false,\"taxes\":[{\"amount\":\"774533.67\",\"code\":\"01\",\"rate\":19,\"name\":\"IVA\",\"type\":\"P\"}],\"unitMeasurementCode\":\"94\",\"standardCode\":\"7007210000\",\"itemName\":\"PARABRISAS GRIS CLARO\",\"itemCodeSupplier\":\"\",\"itemModel\":\"VOLKSWAGEN JETTA 4D SEDAN 2019-2020 NIJ II - BR3 18.0 mm\",\"price\":\"4076493.00\",\"standardType\":\"020\"},{\"brandName\":\"Optima\",\"quantity\":\"1.00\",\"itemCode\":\"OFC-03860-10\",\"description\":\"LATERAL CABINA DER. GRIS MEDIO\",\"isPresent\":false,\"taxes\":[{\"amount\":\"40410.53\",\"code\":\"01\",\"rate\":19,\"name\":\"IVA\",\"type\":\"P\"}],\"unitMeasurementCode\":\"94\",\"standardCode\":\"7007210000\",\"itemName\":\"LATERAL CABINA DER. GRIS MEDIO\",\"itemCodeSupplier\":\"\",\"itemModel\":\"VOLKSWAGEN JETTA 4D SEDAN 2019-2020 NIJ II - BR3 18.0 mm\",\"price\":\"212687.00\",\"standardType\":\"020\"},{\"brandName\":\"Optima\",\"quantity\":\"1.00\",\"itemCode\":\"OFC-03860-11\",\"description\":\"POSTERIOR GRIS MEDIO\",\"isPresent\":false,\"taxes\":[{\"amount\":\"74085.75\",\"code\":\"01\",\"rate\":19,\"name\":\"IVA\",\"type\":\"P\"}],\"unitMeasurementCode\":\"94\",\"standardCode\":\"7007210000\",\"itemName\":\"POSTERIOR GRIS MEDIO\",\"itemCodeSupplier\":\"\",\"itemModel\":\"VOLKSWAGEN JETTA 4D SEDAN 2019-2020 NIJ II - BR3 18.0 mm\",\"price\":\"389925.00\",\"standardType\":\"020\"},{\"brandName\":\"Optima\",\"quantity\":\"1.00\",\"itemCode\":\"OFC-03860-3\",\"description\":\"LATERAL DELANTERO IZQ. GRIS MEDIO\",\"isPresent\":false,\"taxes\":[{\"amount\":\"242462.61\",\"code\":\"01\",\"rate\":19,\"name\":\"IVA\",\"type\":\"P\"}],\"unitMeasurementCode\":\"94\",\"standardCode\":\"7007210000\",\"itemName\":\"LATERAL DELANTERO IZQ. GRIS MEDIO\",\"itemCodeSupplier\":\"\",\"itemModel\":\"VOLKSWAGEN JETTA 4D SEDAN 2019-2020 NIJ II - BR3 18.0 mm\",\"price\":\"1276119.00\",\"standardType\":\"020\"},{\"brandName\":\"Optima\",\"quantity\":\"1.00\",\"itemCode\":\"OFC-03860-4\",\"description\":\"LATERAL DELANTERO DER. GRIS MEDIO\",\"isPresent\":false,\"taxes\":[{\"amount\":\"242462.61\",\"code\":\"01\",\"rate\":19,\"name\":\"IVA\",\"type\":\"P\"}],\"unitMeasurementCode\":\"94\",\"standardCode\":\"7007210000\",\"itemName\":\"LATERAL DELANTERO DER. GRIS MEDIO\",\"itemCodeSupplier\":\"\",\"itemModel\":\"VOLKSWAGEN JETTA 4D SEDAN 2019-2020 NIJ II - BR3 18.0 mm\",\"price\":\"1276119.00\",\"standardType\":\"020\"},{\"brandName\":\"Optima\",\"quantity\":\"1.00\",\"itemCode\":\"OFC-03860-5\",\"description\":\"LATERAL TRASERO IZQ. GRIS MEDIO\",\"isPresent\":false,\"taxes\":[{\"amount\":\"195317.15\",\"code\":\"01\",\"rate\":19,\"name\":\"IVA\",\"type\":\"P\"}],\"unitMeasurementCode\":\"94\",\"standardCode\":\"7007210000\",\"itemName\":\"LATERAL TRASERO IZQ. GRIS MEDIO\",\"itemCodeSupplier\":\"\",\"itemModel\":\"VOLKSWAGEN JETTA 4D SEDAN 2019-2020 NIJ II - BR3 18.0 mm\",\"price\":\"1027985.00\",\"standardType\":\"020\"},{\"brandName\":\"Optima\",\"quantity\":\"1.00\",\"itemCode\":\"OFC-03860-6\",\"description\":\"LATERAL TRASERO DER. GRIS MEDIO\",\"isPresent\":false,\"taxes\":[{\"amount\":\"195317.15\",\"code\":\"01\",\"rate\":19,\"name\":\"IVA\",\"type\":\"P\"}],\"unitMeasurementCode\":\"94\",\"standardCode\":\"7007210000\",\"itemName\":\"LATERAL TRASERO DER. GRIS MEDIO\",\"itemCodeSupplier\":\"\",\"itemModel\":\"VOLKSWAGEN JETTA 4D SEDAN 2019-2020 NIJ II - BR3 18.0 mm\",\"price\":\"1027985.00\",\"standardType\":\"020\"},{\"brandName\":\"Optima\",\"quantity\":\"1.00\",\"itemCode\":\"OFC-03860-9\",\"description\":\"LATERAL CABINA IZQ. GRIS MEDIO\",\"isPresent\":false,\"taxes\"\n" +
":[{\"amount\":\"40410.53\",\"code\":\"01\",\"rate\":19,\"name\":\"IVA\",\"type\":\"P\"}],\"unitMeasurementCode\":\"94\",\"standardCode\":\"7007210000\",\"itemName\":\"LATERAL CABINA IZQ. GRIS MEDIO\",\"itemCodeSupplier\":\"\",\"itemModel\":\"VOLKSWAGEN JETTA 4D SEDAN 2019-2020 NIJ II - BR3 18.0 mm\",\"price\":\"212687.00\",\"standardType\":\"020\"}],\"currencyCode\":\"COP\",\"customer\":{\"lastName\":\"\",\"billingCityName\":\"BOGOTÁ\",\"companyName\":\"BLINDAJES PROTEC CAR LTDA\",\"digitCheck\":\"1\",\"billingCountryName\":\"COLOMBIA\",\"billingRegionName\":\"CUNDINAMARCA\",\"merchantRegistration\":\"\",\"shippingCityName\":\"BOGOTÁ\",\"shippingRegionName\":\"CO\",\"shippingPostalCode\":\"\",\"identificationTypeCode\":\"31\",\"identification\":\"900685330\",\"responsibilities\":\"O-11\",\"billingCountryCode\":\"CO\",\"shippingCountryName\":\"COLOMBIA\",\"personType\":\"1\",\"email\":\"protecar@ejemplo.com\",\"shippingContactName\":\"BLINDAJES PROTEC CAR LTDA ID:900685330\",\"billingRegionCode\":\"25\",\"shippingPhone\":\"8050178\",\"shippingRegionCode\":\"25\",\"billingNeighborhood\":\"BOGOTÁ\",\"shippingCityCode\":\"11001\",\"firstName\":\"BLINDAJES PROTEC CAR LTDA\",\"shippingCountryCode\":\"CO\",\"regimeType\":\"05\",\"phone\":\"8050178\",\"billingCityCode\":\"11001\",\"shippingAddress\":\"Cra 69P No 77 - 50 Barrio las Ferias\",\"billingAddress\":\"Cra 69P No 77 - 50 Barrio las Ferias\",\"shippingNeighborhood\":\"BOGOTÁ\",\"billingPhone\":\"8050178\"}}";
        
      
        
    }

    public void testInvoice() {
    }

    public void createInvoice() {

    }

}

package app.controllers.api.v2;

import app.controllers.APIController;
import app.controllers.authorization.Protected;
import app.models.Intervention;

@Protected
public class InterventionsController extends APIController {

    public void findByInvoiceNumber() {
        if (blank("invoiceNumber")) {
            throw new RuntimeException("Invoice number is mandatory but was empty or null");
        } else {
            String invoiceNumber = takeFirst16digitsOf(param("invoiceNumber"));
            final Intervention intervention = Intervention.findFirst("ITV_INVOICE = ?", invoiceNumber);
            String jsonResponse = intervention.toJson(false);
            respond(jsonResponse);
        }
    }

    public void statesByDocumentNumber() {
        if (blank("documentNumber")) {
            throw new RuntimeException("Document number is mandatory but was empty or null");
        }
    }

    public void eventsByDocumentNumber() {
        if (blank("documentNumber")) {
            throw new RuntimeException("Document number is mandatory but was empty or null");
        }
    }

    public void findByDocumentNumber() {
        if (blank("documentNumber")) {
            throw new RuntimeException("Document number is mandatory but was empty or null");
        }
    }

    private String takeFirst16digitsOf(String fullInvoiceNumber) {
        return fullInvoiceNumber.substring(0, 16);
    }
}

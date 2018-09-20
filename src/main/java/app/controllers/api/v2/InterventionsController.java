package app.controllers.api.v2;

import app.controllers.APIController;
import app.controllers.authorization.Protected;

@Protected
public class InterventionsController extends APIController {

    public void findByInvoiceNumber() {
        if (blank("invoiceNumber")) {
            throw new RuntimeException("Invoice number is mandatory but was empty or null");
        } else {
            respond("hello: " + param("invoiceNumber"));
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
}

package app.config;

import app.controllers.api.v2.AuthorsController;
import app.controllers.api.v2.InterventionsController;
import org.javalite.activeweb.AbstractRouteConfig;
import org.javalite.activeweb.AppContext;


public class RouteConfig extends AbstractRouteConfig {
    @Override
    public void init(AppContext appContext) {
      route("/api/v2/{controller}/invoiceNumber/{invoiceNumber}").to(InterventionsController.class).action("findByInvoiceNumber");
      route("/api/v2/{controller}/documentNumber/{documentNumber}/states").to(InterventionsController.class).action("statesByDocumentNumber");
      route("/api/v2/{controller}/documentNumber/{documentNumber}/events").to(InterventionsController.class).action("eventsByDocumentNumber");
      route("/api/v2/{controller}/documentNumber/{documentNumber}").to(InterventionsController.class).action("findByDocumentNumber");
      route("/api/v2/{controller}/{aut_id}").to(AuthorsController.class).action("findById");
    }
}

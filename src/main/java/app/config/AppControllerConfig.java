package app.config;

import app.controllers.CatchAllFilter;
import app.controllers.api.v2.AuthorsController;
import app.controllers.api.v2.InterventionsController;
import app.controllers.authorization.AuthorizationFilter;
import org.javalite.activeweb.AbstractControllerConfig;
import org.javalite.activeweb.AppContext;
import org.javalite.activeweb.controller_filters.DBConnectionFilter;

public class AppControllerConfig extends AbstractControllerConfig {

    public void init(AppContext context) {
        add(new DBConnectionFilter(), new CatchAllFilter()).to(AuthorsController.class, InterventionsController.class);
        add(new AuthorizationFilter()).to(InterventionsController.class);
    }
}

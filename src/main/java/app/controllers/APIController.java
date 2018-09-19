package app.controllers;

import org.javalite.activeweb.AppController;

public abstract class APIController extends AppController {
    @Override
    protected String getContentType() {
        return "application/json";
    }

    @Override
    protected String getLayout() {
        return null;
    }

}

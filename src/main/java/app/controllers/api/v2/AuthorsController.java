package app.controllers.api.v2;

import app.controllers.APIController;
import app.controllers.authorization.Protected;
import app.models.Author;

/**
 * This is just an example, remove it when no more needed
 */
public class AuthorsController extends APIController {

    public void findById() {
        System.out.println(params());
        if (blank("aut_id")) {
            throw new RuntimeException("autId number is mandatory but was empty or null");
        } else {
            respond("hello: " + param("aut_id"));
        }
    }
}

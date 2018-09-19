package app.controllers;

import com.fasterxml.jackson.core.JsonParseException;
import org.javalite.activeweb.controller_filters.HttpSupportFilter;

import static org.javalite.common.Collections.map;

public class CatchAllFilter extends HttpSupportFilter {
    @Override
    public void onException(Exception e) {
        if (e.getCause() instanceof JsonParseException) {
            render("/errors/message", map("message", "malformed JSON format", "code", 500));
        } else {
            // this is an exception thrown from any controller on purpose.
            render("/errors/message", map("message", e.getMessage(), "code", 500));
        }
    }
}

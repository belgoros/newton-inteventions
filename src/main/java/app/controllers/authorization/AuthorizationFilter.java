package app.controllers.authorization;

import org.apache.commons.lang3.StringUtils;
import org.javalite.activeweb.controller_filters.HttpSupportFilter;

import static org.javalite.common.Collections.map;

public class AuthorizationFilter extends HttpSupportFilter {

    private final static String EMPTY_STRING_SEPARATOR = " ";

    @Override
    public void before() {

        if (!controllerProtected()) {
            return;// allow to fall to controller
        }

        if (!hasAuthorizationHeader() && controllerProtected()) {
            render("/errors/message", map("message", "Access denied", "code", 403));
        }
    }

    private boolean controllerProtected() {
        return getRoute().getController().getClass().getAnnotation(Protected.class) != null;
    }

    private boolean hasAuthorizationHeader() {
        final String authorization = header("Authorization");

        if (StringUtils.isBlank(authorization)) {
            return false;
        }

        if (!hasToken(authorization)) {
            return false;
        }

        return true;
    }

    private boolean hasToken(String authorization) {
        final String[] split = authorization.split(EMPTY_STRING_SEPARATOR);

        if (!hasBearer(split)) {
            return false;
        }

        final String token = split[split.length - 1];
        if (StringUtils.isBlank(token)) {
            return false;
        }

        return true;
    }

    private boolean hasBearer(String [] authChain) {
        return authChain[0].equalsIgnoreCase(Authorization.BEARER.getAuthName());
    }
}

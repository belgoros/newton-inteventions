package app.controllers.authorization;

public enum Authorization {
    BASIC("Basic"),
    BEARER("Bearer");

    private final String authName;

    Authorization(String authName) {
        this.authName = authName;
    }

    public String getAuthName() {
        return authName;
    }
}

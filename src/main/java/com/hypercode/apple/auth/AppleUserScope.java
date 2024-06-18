package com.hypercode.apple.auth;

public enum AppleUserScope {
    EMAIL("email"),
    NAME("name");

    private final String literal;

    AppleUserScope(String literal)
    {
        this.literal = literal;
    }

    String getLiteral() {
        return literal;
    }
}

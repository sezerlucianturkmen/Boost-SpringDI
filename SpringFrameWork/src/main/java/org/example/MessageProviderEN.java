package org.example;

public class MessageProviderEN implements IProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}

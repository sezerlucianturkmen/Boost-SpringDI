package org.example;

public class MessageProviderTR implements IProvider {

    @Override
    public String getMessage() {
        return "Merhaba Dünya!";
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}

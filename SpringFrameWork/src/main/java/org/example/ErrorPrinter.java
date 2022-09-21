package org.example;

public class ErrorPrinter implements IPrinter {
    IProvider provider;
    @Override
    public void setProvider(IProvider provider) {
        this.provider = provider;
    }

    @Override
    public void print() {
        System.err.println(provider.getMessage());
    }
}

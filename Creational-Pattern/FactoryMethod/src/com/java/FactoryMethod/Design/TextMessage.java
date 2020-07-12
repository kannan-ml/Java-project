package com.java.FactoryMethod.Design;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "Normal TextMessage";
    }
}

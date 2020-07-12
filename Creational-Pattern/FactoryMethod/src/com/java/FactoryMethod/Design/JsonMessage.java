package com.java.FactoryMethod.Design;

public class JsonMessage extends Message {
    @Override
    public String getContent() {
        return "JSON";
    }
}

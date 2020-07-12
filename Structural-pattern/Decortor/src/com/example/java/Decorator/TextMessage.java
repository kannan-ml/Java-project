package com.example.java.Decorator;

public class TextMessage implements Message {
    private String text;
    public TextMessage(String txt){
        this.text=txt;
    }
    @Override
    public String getContent() {
        return this.text;
    }
}

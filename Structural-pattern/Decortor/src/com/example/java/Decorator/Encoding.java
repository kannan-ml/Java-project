package com.example.java.Decorator;

public class Encoding implements Message{
    private Message msg;
    public Encoding(Message obj){
        this.msg=obj;
    }
    @Override
    public String getContent() {
        String result="64 Encoding of"+msg.getContent();
        return result;
    }
}

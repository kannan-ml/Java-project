package com.example.java.Decorator;

public class HtmlEncoder implements Message{
    private Message msg;
    public HtmlEncoder(Message obj){
        this.msg=obj;
    }
    @Override
    public String getContent(){
        String result="<" +msg.getContent()+ ">";
        return result;
    }
}

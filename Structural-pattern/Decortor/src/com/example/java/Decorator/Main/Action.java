package com.example.java.Decorator.Main;

import com.example.java.Decorator.Encoding;
import com.example.java.Decorator.HtmlEncoder;
import com.example.java.Decorator.Message;
import com.example.java.Decorator.TextMessage;

public class Action {
    public static void main(String[] args){
        Message msg=new TextMessage("Hi how are you");
        System.out.println(msg.getContent());
        //now pass msg object to html encoding
        Message htmlmsg=new HtmlEncoder(msg);
        System.out.println(htmlmsg.getContent());
        //now pass msg or htmlmsg to encoding
        Message encoding=new Encoding(msg);
        System.out.println(encoding.getContent());
    }
}

package com.java.FactoryMethod.Design.Client;

import com.java.FactoryMethod.Design.Creator.JsonMessageCreator;
import com.java.FactoryMethod.Design.Creator.MessageCreator;
import com.java.FactoryMethod.Design.Message;

public class Client {
    public static void main(String[] args){
        printMessage(new JsonMessageCreator());
    }
    public static void printMessage(MessageCreator creator){
        Message msg=creator.getMessage();


    }
}

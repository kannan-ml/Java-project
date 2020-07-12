package com.java.FactoryMethod.Design.Creator;

import com.java.FactoryMethod.Design.Message;

public abstract class MessageCreator {
    public Message getMessage(){
        return createMessage();
    }
    public abstract Message createMessage();
}

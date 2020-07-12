package com.java.FactoryMethod.Design.Creator;

import com.java.FactoryMethod.Design.JsonMessage;
import com.java.FactoryMethod.Design.Message;

public class JsonMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}

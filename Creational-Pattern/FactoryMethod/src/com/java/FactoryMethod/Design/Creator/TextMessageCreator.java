package com.java.FactoryMethod.Design.Creator;

import com.java.FactoryMethod.Design.Message;
import com.java.FactoryMethod.Design.TextMessage;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}

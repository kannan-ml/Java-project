package com.example.java.Order.Observer;

import com.example.java.Order.Order;

public class Quantity implements Observer {
    public Quantity(Order order){
        order.attach(this);
    }
    @Override
    public void update(Order order) {
        System.out.println("update received");
    }
}

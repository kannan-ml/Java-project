package com.example.java.Order.Observer;

import com.example.java.Order.Order;

public class Price implements Observer {
    //private Order order;
    public Price(Order order){
        order.attach(this);
    }
    @Override
    public void update(Order order) {
        int price=order.getAmount();
        if(price>=200){
            order.setDiscount(20);
        }
        else {
            order.setDiscount(10);
        }

    }
}

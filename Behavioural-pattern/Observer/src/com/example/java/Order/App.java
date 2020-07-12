package com.example.java.Order;

import com.example.java.Order.Observer.Observer;
import com.example.java.Order.Observer.Price;
import com.example.java.Order.Observer.Quantity;

public class App {
    public static void main(String[] args){
        Order obj=new Order("Toys",150,5);
        System.out.println(obj);
        Observer price=new Price(obj);
        Observer quantity=new Quantity(obj);
        obj.setAmount(200);
        System.out.println(obj);

    }
}

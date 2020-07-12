package com.example.java.Order;

import com.example.java.Order.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String name;
    private int amount;
    private int quantity;
    private int discount;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    List<Observer> sub=new ArrayList<>();
    public String getName() {
        return name;
    }
    public void attach(Observer obs){
        sub.add(obs);

    }
    public void dettach(Observer obs){
        sub.remove(obs);
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        for(Observer observer:sub){
            observer.update(this);
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
       return this.name+" "+this.amount+" "+this.quantity+" "+this.discount;
    }

    Order(String name, int amount, int quantity){
        this.name=name;
        this.amount=amount;
        this.quantity=quantity;
    }

}

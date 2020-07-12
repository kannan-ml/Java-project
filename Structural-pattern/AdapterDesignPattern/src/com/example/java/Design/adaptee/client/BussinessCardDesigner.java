package com.example.java.Design.adaptee.client;

public class BussinessCardDesigner {

public String designCard(Customer customer){
    String card="";
    card+=customer.getName();
    card+="\n"+customer.getDesignation();
    card+="\n"+customer.getAddress();
    return card;
}
}

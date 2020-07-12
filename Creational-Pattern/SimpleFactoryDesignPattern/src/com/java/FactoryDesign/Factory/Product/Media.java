package com.java.FactoryDesign.Factory.Product;

public abstract class Media {
    String type;
    Media(String exampple){
        type=exampple;
    }
    public void print(){
        System.out.println(type);
    }
}

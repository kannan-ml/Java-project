package com.java.FactoryDesign.Factory.Client;

import com.java.FactoryDesign.Factory.Product.Media;
import com.java.FactoryDesign.Factory.factory.SimpleFactory;

public class Demo {
    public static void main(String[] args){
        Media media=SimpleFactory.getMedia("SocialMedia");
        media.print();

    }
}

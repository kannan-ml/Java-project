package com.java.client;

import com.java.Builder.ConcreteBuilder;
import com.java.product.Address;
import com.java.product.Product;

public class Demo {
    public static void main(String[] args){
        Address add=new Address();
        add.setCity("Neweyour");
        add.setState("kerala");
        add.setHouseNumber("66/104");
        add.setStreet("pulwama");
        add.setZipcode("6000784");
        Product product=new ConcreteBuilder().firstName("Builder").secondName("Pattern").dateOfBirth(32).address(add).build();
        System.out.println(product.getName());
        System.out.println(product.getAddress());
        System.out.println(product.getAge());
    }


}

package com.java.Builder;

import com.java.product.Address;
import com.java.product.Product;

import java.time.LocalDate;
import java.time.Period;

public class ConcreteBuilder implements Builder {
    private String firstName;
    private String secondName;
    private int age;
    private String adde;
    private Product product;

    @Override
    public Builder firstName(String name) {
        this.firstName=name;
        return this;
    }

    @Override
    public Builder secondName(String name) {
        this.secondName=name;
        return this;
    }

    @Override
    public Builder dateOfBirth(int age1) {
        age=age1;
        return this;
    }

    @Override
    public Builder address(Address address) {
        this.adde=address.getHouseNumber()+","+address.getStreet()+"\n"+address.getCity()+"\n"+address.getState();
        return this;
    }

    @Override
    public Product build() {
        product=new Product(firstName+" "+secondName,adde,age);
    return product;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

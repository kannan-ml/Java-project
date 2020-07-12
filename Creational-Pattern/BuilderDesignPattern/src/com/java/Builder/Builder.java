package com.java.Builder;

import com.java.product.Address;
import com.java.product.Product;

import java.time.LocalDate;

public interface Builder {
    Builder firstName(String name);
    Builder secondName(String name);
    Builder dateOfBirth(int date);
    Builder address(Address address);
    public Product build();
    public Product getProduct();
}

package com.example.java.Design.adaptee.adaptor;

import com.example.java.Design.adaptee.Employee;
import com.example.java.Design.adaptee.client.Customer;

public class EmployeeClassAdaptor extends Employee implements Customer {
    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}

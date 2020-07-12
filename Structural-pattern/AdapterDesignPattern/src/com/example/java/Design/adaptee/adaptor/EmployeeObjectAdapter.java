package com.example.java.Design.adaptee.adaptor;

import com.example.java.Design.adaptee.Employee;
import com.example.java.Design.adaptee.client.Customer;

public class EmployeeObjectAdapter implements Customer {
    private Employee employee;
    EmployeeObjectAdapter(Employee emp){
        this.employee=emp;
    }
    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
}

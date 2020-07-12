package com.example.java.Design.adaptee.adaptor;

import com.example.java.Design.adaptee.Employee;
import com.example.java.Design.adaptee.client.BussinessCardDesigner;
import com.example.java.Design.adaptee.client.Customer;

public class main {
    public static void main(String[] args){
        EmployeeClassAdaptor employeeClassAdaptor=new EmployeeClassAdaptor();
        populateEmpolyee(employeeClassAdaptor);
        BussinessCardDesigner bussinessCardDesigner=new BussinessCardDesigner();
        String card=bussinessCardDesigner.designCard(employeeClassAdaptor);
        System.out.println(card);

    }
    private static void populateEmpolyee(Employee employee){
        employee.setFullName("Kannan");
        employee.setJobTitle("Software Developer");
        employee.setOfficeLocation("TCS");
    }
}

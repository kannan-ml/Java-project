package com.example.java.Design.adaptee.adaptor;

import com.example.java.Design.adaptee.Employee;
import com.example.java.Design.adaptee.client.BussinessCardDesigner;
import com.example.java.Design.adaptee.client.Customer;

public class ObjectAdapter {
    public static void main(String[] args){
        Employee employee=new Employee();
        populateEmpolyee(employee);
        Customer employeeObjectAdapter=new EmployeeObjectAdapter(employee);
        BussinessCardDesigner bussinessCardDesigner=new BussinessCardDesigner();
        System.out.println(bussinessCardDesigner.designCard(employeeObjectAdapter));
    }
    private static void populateEmpolyee(Employee employee){
        employee.setFullName("Kannan");
        employee.setJobTitle("Software Developer");
        employee.setOfficeLocation("TCS");
    }
}

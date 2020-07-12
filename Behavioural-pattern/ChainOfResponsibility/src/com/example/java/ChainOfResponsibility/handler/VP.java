package com.example.java.ChainOfResponsibility.handler;

import com.example.java.ChainOfResponsibility.Mode.Leave;
import com.example.java.ChainOfResponsibility.Models.Pattern.LeaveApprover;

public class VP extends LeaveApprover {
    @Override
    public void leave(Leave leave) {
        if(leave.desgination.equals("Manager")){
            System.out.println("Leave is approved by VP");
        }else{
            System.out.println("Default approved by VP");
        }
    }
}

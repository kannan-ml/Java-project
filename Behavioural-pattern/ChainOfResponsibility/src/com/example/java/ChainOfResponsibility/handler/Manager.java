package com.example.java.ChainOfResponsibility.handler;

import com.example.java.ChainOfResponsibility.Mode.Leave;
import com.example.java.ChainOfResponsibility.Models.Pattern.LeaveApprover;

public class Manager extends LeaveApprover {
    @Override
    public void leave(Leave leave) {
        if(leave.desgination.equals("TeamLead")){
            System.out.println("Leave is approved by Manager");
        }
        else{
            this.leaveApprover=new VP();
            leaveApprover.leave(leave);
        }
    }
}

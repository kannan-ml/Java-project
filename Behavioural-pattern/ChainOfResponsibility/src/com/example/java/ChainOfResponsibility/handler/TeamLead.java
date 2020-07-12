package com.example.java.ChainOfResponsibility.handler;

import com.example.java.ChainOfResponsibility.Mode.Leave;
import com.example.java.ChainOfResponsibility.Models.Pattern.LeaveApprover;

public class TeamLead extends LeaveApprover {
    @Override
    public void leave(Leave leave) {
        if(leave.desgination.equals("Developer")){
            System.out.println("Leave Approved by Team Lead");
        }
        else{
            this.leaveApprover=new Manager();
            leaveApprover.leave(leave);
        }
    }
}

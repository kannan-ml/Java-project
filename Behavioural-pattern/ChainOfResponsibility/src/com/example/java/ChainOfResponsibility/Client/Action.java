package com.example.java.ChainOfResponsibility.Client;

import com.example.java.ChainOfResponsibility.Mode.Leave;
import com.example.java.ChainOfResponsibility.Models.Pattern.LeaveApprover;
import com.example.java.ChainOfResponsibility.handler.TeamLead;

public class Action {
    public static void main(String[] args){
        Leave leave=new Leave("Kannan","Developer",5,"25/05/2020","30/05/2020");
        Leave leave1=new Leave("GURU","TeamLead",5,"25/05/2020","30/05/2020");
        LeaveApprover leaveApprover=new TeamLead();
        leaveApprover.leave(leave);
        leaveApprover.leave(leave1);


    }
}

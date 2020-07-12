package com.example.java.ChainOfResponsibility.Models.Pattern;

import com.example.java.ChainOfResponsibility.Mode.Leave;

public abstract class LeaveApprover{
    public LeaveApprover leaveApprover;
    public abstract void leave(Leave leave);
}

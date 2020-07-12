package com.example.java.ChainOfResponsibility.Mode;

public class Leave{
    private String name;
    public String desgination;
    public int noOFleavedays;
    private String from;
    private String to;
    public Leave(String name,String desgination,int noOFleavedays,String from,String to){
        this.name=name;
        this.desgination=desgination;
        this.noOFleavedays=noOFleavedays;
        this.from=from;
        this.to=to;
    }
}

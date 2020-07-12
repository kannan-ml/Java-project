package com.example.java.composite;

public abstract class File{
    private String name;
    File(String txt){
        this.name=txt;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public abstract void ls();

    public abstract File[] getFiles();

    public abstract void addFile(File file);

    public abstract boolean removeFiles(File file);
}

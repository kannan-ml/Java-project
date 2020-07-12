package com.example.java.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
 private List<File> Children=new ArrayList<>();
    public Directory(String txt) {
        super(txt);
    }

    @Override
    public void ls() {
        System.out.println(this.getName());
        for(File name:Children){
           name.ls();
        }
    }

    @Override
    public File[] getFiles() {
        return Children.toArray(new File[Children.size()]);
    }

    @Override
    public void addFile(File file) {
        Children.add(file);
    }

    @Override
    public boolean removeFiles(File file) {
        return Children.remove(file);
    }
}

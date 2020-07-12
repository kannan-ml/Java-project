package com.example.java.composite;

public class binaryFile extends File{
    private long size;
    public binaryFile(String name, long size){
        super(name);
        this.size=size;
    }

    @Override
    public void ls() {
        System.out.println(getName()+"\t"+size);

    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node doesn't have this operation");
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf node doesn't have this operation");
    }

    @Override
    public boolean removeFiles(File file) {
        throw new UnsupportedOperationException("Leaf node doesn't have this operation");
    }


}

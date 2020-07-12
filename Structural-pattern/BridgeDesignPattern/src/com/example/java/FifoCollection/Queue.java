package com.example.java.FifoCollection;

import com.example.java.LinkedList.ArrayLinkedList;
import com.example.java.LinkedList.CustomLinkedList;

import java.util.List;

public class Queue extends Fifo{
    private CustomLinkedList customLinkedList;
    public Queue(){
        customLinkedList=new ArrayLinkedList();
    }
    @Override
    public void offer(int num) {
        this.customLinkedList.addFirst(num);
    }

    @Override
    public void poll() {
        this.customLinkedList.removefirst();
    }



}

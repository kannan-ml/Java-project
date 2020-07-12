package com.example.java.client;

import com.example.java.FifoCollection.Fifo;
import com.example.java.FifoCollection.Queue;

public class Action {
    public static void main(String[] args){
        Fifo fifo=new Queue();
        fifo.offer(5);
        fifo.poll();
        fifo.offer(7);
        fifo.offer(9);
        fifo.offer(10);


    }
}

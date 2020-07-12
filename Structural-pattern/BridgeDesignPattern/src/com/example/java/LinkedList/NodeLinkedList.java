package com.example.java.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class NodeLinkedList implements CustomLinkedList{
    List<Integer> list;
    NodeLinkedList(){
       list=new LinkedList<>();
    }
    @Override
    public void addFirst(int ele) {
      list.add(0,ele);
    }

    @Override
    public void removefirst() {
        list.remove(0);

    }

    @Override
    public void addLast(int ele) {
        list.add(list.size(),ele);
    }

    @Override
    public void removeLast() {
    list.remove(list.size()-1);
    }
}

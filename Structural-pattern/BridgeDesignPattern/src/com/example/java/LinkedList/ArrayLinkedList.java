package com.example.java.LinkedList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayLinkedList implements CustomLinkedList{
    public List<Integer> list;
    public ArrayLinkedList(){
        list=new ArrayList<Integer>();
    }

    @Override
    public void addFirst(int ele) {
        list.add(0,ele);
    }

    @Override
    public void removefirst() {
        System.out.println(list.remove(0));
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

package com.example.java.iterator;

public class App {
public static void main(String[] args){
    Iterator<ThemeColor> itr=ThemeColor.getIterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
}
}

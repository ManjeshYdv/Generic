package com.Generic;

import java.util.ArrayList;

class UpperDemo{
    public void displayUpper(ArrayList<? extends Number>a1){
        for(Number i:a1)
        {
            System.out.println(a1);
        }

    }
}
public class UperDemo {
    public static void main(String[] args) {
        UpperDemo v1= new UpperDemo();
        ArrayList<Integer>a1 =new ArrayList<>();
        a1.add(30);
        a1.add(20);
  //      System.out.println(a1);
        v1.displayUpper(a1);
    }
}

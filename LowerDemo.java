package com.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerDemo {

    public static void displayDemo(List<? super Integer> l){
        for(Object n:l){
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        List<Integer>a1= Arrays.asList(1,2,34,5);
        displayDemo(a1);

    }
}

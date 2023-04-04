package com.Generic;

class Rec<T,U>{
    T len;
    U bre;
    public Rec(T len,U bre){
        this.bre=bre;
        this.len=len;
    }
    public T getLength(){
        return len;
    }
    public U getbreadth(){
        return bre;
    }
}

public class Multiple_parameter {
    public static void main(String[] args) {
        Rec<Integer,Double> a1 = new Rec<>(12,12.5);
        Double bre1=a1.getbreadth();
        Integer len1 =a1.getLength();
        System.out.println("the area of rectangle is "+(bre1*len1));
    }
}
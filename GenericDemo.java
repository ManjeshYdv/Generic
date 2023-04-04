package com.Generic;

class Rectangle<T,U>{
    T length;
    U breadth;
    public Rectangle(T length,U breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void CalcArea(){
  //      double area = length * breadth;
    //    System.out.println("The area of rectangle is " + area);
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        Rectangle<Double,Double>r1= new Rectangle<Double,Double>(34.2,53.3);
        r1.CalcArea();
    }
}

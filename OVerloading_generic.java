package com.Generic;
class Rectangle1<T>{
    private T len;
    private T bre;
    public T hight;
    public Rectangle1(T len,T bre,T hight){
        this.len=len;
        this.bre=bre;
        this.hight=hight;
    }
    public T get(){
        return len;
    }
    public T get(T bre){
        return bre;
    }

}
public class OVerloading_generic {
    public static void main(String[] args) {
        Rectangle1<Integer> r1= new Rectangle1<Integer>(12,13,14);
        System.out.println(r1.get());
        System.out.println(r1.get(111));
    }
}

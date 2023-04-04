package com.Generic;

class Show<T>{
    T obj;
    T obj1;
    public Show(T obj,T obj1){
        this.obj=obj;
        this.obj1=obj1;
    }
    public void display(){
        System.out.println("the value of obj is "+obj);
        System.out.println("the value of another obj1 is ="+obj1);
    }

}
public class Generic_Exm {
    public static void main(String[] args) {
        Show<Integer>a1= new Show<Integer>(12,14);
        a1.display();
        Show<String>s= new Show<>("ram tero bauko tauko ","sita temro bau ko tauko");
        s.display();
    }
}



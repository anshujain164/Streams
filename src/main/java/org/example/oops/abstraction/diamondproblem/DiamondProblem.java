package org.example.oops.abstraction.diamondproblem;

interface A{
    default void show(){
        System.out.println("show from A");
    }
}

interface B{
    default void show(){
        System.out.println("show from B");
    }
}

class C implements A, B{
    public void show(){
        /// here resolve the problem of diamond problem
        A.super.show(); /// B.super.show();
    }
}

public class DiamondProblem {
    public static void main(String[] args){
        C obj = new C();
        obj.show();
    }
}

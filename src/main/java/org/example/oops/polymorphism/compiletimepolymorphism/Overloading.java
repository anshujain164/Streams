package org.example.oops.polymorphism.compiletimepolymorphism;
class Printer{
    public void print(String text){
        System.out.println("printing text : " + text);
    }

    public void print(int number){
        System.out.println("printing number : "+ number);
    }

    public void print(String text , int copies){
        System.out.println("printing text : "+ text + " and copies : " + copies);
    }
}
public class Overloading {
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.print("anshu");
        printer.print(100);
        printer.print("Hello " , 5);
    }
}

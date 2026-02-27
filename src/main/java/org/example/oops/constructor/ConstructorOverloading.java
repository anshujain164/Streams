package org.example.oops.constructor;
class User{
    private String name;
    private int age;

    public User(){
        this("unknown ",0);
    }

    public User(String name){
        this(name , 0);
    }

    public User(String name, int age){
        this.name  = name;
        this.age = age;
    }

    public void show(){
        System.out.println("Username  = "+ name + "User age = "+ age);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args){
         new User().show();
         new User("anshu ").show();
         new User("anshu " , 20).show();


    }
}

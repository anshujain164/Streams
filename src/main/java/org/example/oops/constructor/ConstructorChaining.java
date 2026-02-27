package org.example.oops.constructor;
class Person{
    protected String name;
    public Person(){
        this("unnamed");/// this calls the below parametrized constructor
    }

    public Person(String name){
        this.name = name;
        System.out.println("Person Constructor : " + name);
    }
}

class Student extends Person{
    private int grade;

    public Student(){
        this("unnamed " , -1);
    }

    public Student (String name , int grade){
        super(name);/// this calls parent class constructor
        this.grade = grade;
        System.out.println("constructor of Student  : "+ name + " : " + grade);
    }
}
public class ConstructorChaining {
    public static void main(String[] args){
        new Student();
        new Student("anshi" , 50);
    }
}

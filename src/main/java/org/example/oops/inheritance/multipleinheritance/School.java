package org.example.oops.inheritance.multipleinheritance;
class Person{
    String name;
    int age;

    public void showDetails(){
        System.out.println("name : "+name);
        System.out.println("age : "+ age);
    }
}

class Student extends Person{
    int standard;

    public void standard(){
        System.out.println(name + " is studying in " + standard + "th Standard");
    }
}

class TopperStudent extends Student{
    int grade;

    public void study(){
        System.out.println(standard + "th Standard with "+ grade+ " grade" );
    }
}
public class School {
    public static void main(String[] args){
        TopperStudent topperStudent = new TopperStudent();
        topperStudent.name = "Ram";
        topperStudent.age = 15;
        topperStudent.standard = 10;
        topperStudent.grade = 90;

        topperStudent.showDetails();
        topperStudent.standard();
        topperStudent.study();
    }
}

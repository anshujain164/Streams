package org.example.oops.inheritance.multipleinheritance;

interface Play{
    void play();
}

interface Study{
    void study();
}

class Student implements Play,Study{
    String name;
    int id;
    public void play(){
        System.out.println(name +" is playing ");
    }

    public void study(){
        System.out.println(name +" is studying ");
    }

    public void studentDetails(){
        System.out.println("name : " + name);
        System.out.println("id : "+ id);
    }

}
public class School {
    public static void main(String[] args){
        Student student =  new Student();
        student.name = "Anshu";
        student.id = 21;

        student.studentDetails();
        student.play();
        student.study();
    }
}

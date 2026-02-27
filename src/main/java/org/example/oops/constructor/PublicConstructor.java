package org.example.oops.constructor;
class Car{
    private String model;

    public Car(String model){
        this.model = model;
    }

    public void show(){
        System.out.println("Car model : "+ model);
    }
}

public class PublicConstructor {
    public static void main(String[] args){
        Car car = new Car("HondaCity");
        car.show();
    }
}

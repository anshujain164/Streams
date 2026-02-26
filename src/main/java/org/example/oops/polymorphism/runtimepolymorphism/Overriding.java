package org.example.oops.polymorphism.runtimepolymorphism;
class Vehicle{
    public void start(){
        System.out.println("Vehicle is starting... ");
    }
}

class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike is starting....");
    }
}

public class Overriding {
    public static void main(String[] args){
        Vehicle vehicle;
        vehicle = new Bike();

        /// here runs the method of bike which is child
        vehicle.start();

        vehicle = new Vehicle();
        /// here runs the methode of vehicle which is Parent
        vehicle.start();
    }
}
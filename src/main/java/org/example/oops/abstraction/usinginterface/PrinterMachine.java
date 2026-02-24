package org.example.oops.abstraction.usinginterface;
interface Printer{
    void print();
}

class LaserPrinter implements Printer{
    public void print(){
        System.out.println("laser printing...");
    }
}

class InkjetPrinter implements Printer{
    public void print(){
        System.out.println("inkjet printing...");
    }
}
public class PrinterMachine {
    public static void main(String[] args){
        Printer laserPrinter = new LaserPrinter();
        laserPrinter.print();

        Printer inkjetPrinter =  new InkjetPrinter();
        inkjetPrinter.print();
    }
}

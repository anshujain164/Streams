package org.example.oops.abstraction.usingabstractclass;
abstract class Payment{
    abstract void paymentProcess();

    public void showReceipt(){
        System.out.println("Receipt is generated");
    }
}

class CreditCard extends Payment{
    public void paymentProcess(){
        System.out.println("processing with credit card ...");
    }
}
public class PaymentsApp {
    public static void main(String[] args){
        CreditCard creditCard = new CreditCard();
        creditCard.paymentProcess();
        creditCard.showReceipt();
    }
}

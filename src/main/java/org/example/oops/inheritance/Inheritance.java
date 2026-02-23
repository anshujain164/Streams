package org.example.oops.inheritance;

import javax.sound.midi.SysexMessage;

class BankAccount{
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited : "+ amount);
    }
     public void show(){
        System.out.println("Balance : "+ balance);
    }
}

/// child class 1
class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    public void addInterset(){
        balance += balance * 0.05;
        System.out.println("Interset added : " + balance);
    }
}

/// child class 2
class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("withdraw : " + amount);
    }
}

public class Inheritance {
    public static void main(String[] args){
        SavingAccount savingAccount = new SavingAccount("362764", 2000 );
        savingAccount.addInterset();
        savingAccount.deposit(300);
        savingAccount.show();

        CurrentAccount currentAccount = new CurrentAccount("6327845", 5000);
        currentAccount.withdraw(500);
        currentAccount.show();

    }
}

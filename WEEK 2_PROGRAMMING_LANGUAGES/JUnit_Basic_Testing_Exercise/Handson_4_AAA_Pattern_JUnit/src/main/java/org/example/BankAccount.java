package org.example;

public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(String owner,double initialDeposit){
        this.owner=owner;
        this.balance=initialDeposit;
    }
    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be positive");
        }
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -=amount;
    }
    public double getBalance(){
        return balance;
    }
    public String getOwner(){
        return owner;
    }
}

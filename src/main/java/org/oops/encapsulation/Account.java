package org.oops.encapsulation;

public class Account {
    private int balance = 1000; // hidden from outside world, No directly access

    public void withdraw(int amount){
        if ( amount <= balance) balance -= amount;
    }

    // Getter
    public int getBalance(){
        return balance;
    }

    // Setter
    public void deposit(int amount){
        if ( amount > 0) balance += amount;
    }
}

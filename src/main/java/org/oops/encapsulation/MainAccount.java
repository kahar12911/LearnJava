package org.oops.encapsulation;

public class MainAccount {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.getBalance());
        account.deposit(500);
        System.out.println(account.getBalance());
        account.withdraw(700);
        System.out.println(account.getBalance());
    }
}

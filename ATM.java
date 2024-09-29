package internship;

import java.util.Scanner;

class useraccount {
    double balance = 0;
    int w = 0, d = 0;

    // withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(
                    "Withdraw Successful, available balance after successful withdrawl , Current balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Transactioon Failure , Insufficient Balance . To check Available balance click 3 ");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // balance
    public double balance() {
        return balance;
    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("**********MENU**********");
            System.out.println(" -> 1. To Withdraw press 1 ");
            System.out.println(" -> 2. To Deposite press 2");
            System.out.println(" -> 3. To check balance press 3 ");
            System.out.println(" -> 0. To EXIT press 0");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    w++;
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    d++;
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + balance());
                    break;
                case 0:
                    System.out.println();
                    for (int i = 0; i < 30; i++) {
                        System.out.print("=");
                    }
                    System.out.println();
                    for (int i = 0; i < 30; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    System.out.println("No of times Withdraws through out the process =" + w);
                    System.out.println("No of times Deposit through out the process =" + d);
                    System.out.println();
                    for (int i = 0; i < 30; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    for (int i = 0; i < 30; i++) {
                        System.out.print("=");
                    }
                    System.out.println();
                    System.out.println("EXIT , Have a good Day");
                    System.out.println("Thanks for using ATM !!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        useraccount account = new useraccount(); // Initial balance of 1000
        account.Menu();
    }
}
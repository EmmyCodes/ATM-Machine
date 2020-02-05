package com.example;
import java.util.Scanner;
public class ATM_machine {

    public static void main(String args[]) {
        int balance = 500000, withdraw, deposit, TopUP;
        int expiry;
        int pin = 1234;
        int date = 2020;
        int password;
        Scanner s = new Scanner(System.in);
        {
            System.out.println("Welcome");
            System.out.println("Please enter Pin: ");
            {
                password = s.nextInt();

                while (password != pin) {
                    System.out.println("Incorrect password");
                    System.out.println("Enter pin: ");
                    password = s.nextInt();
                }
                if (password == pin) {
                    System.out.println("Automated Teller Machine");
                    System.out.println("Choose 1 for Withdraw");
                    System.out.println("Choose 2 for Deposit");
                    System.out.println("Choose 3 for Check Balance");
                    System.out.println("Choose 4 for EXIT");
                    System.out.println("Choose 5 for Airtime TopUp");
                    System.out.println("Choose 6 for card Expiry date");
                    System.out.print("Choose the operation you want to perform:");

                    int n = s.nextInt();
                    switch (n) {
                        case 1:
                            System.out.print("Enter Amount to be withdrawn:");
                            withdraw = s.nextInt();
                            if (balance >= withdraw) {
                                balance = balance - withdraw;
                                System.out.println( withdraw + " "+ "Is withdrawn!");
                                System.out.println("Your balance is :" + balance);

                            } else {
                                System.out.println("Insufficient Balance");
                            }
                            System.out.println("");
                            break;

                        case 2:
                            System.out.print("Enter money to be deposited:");
                            deposit = s.nextInt();
                            balance = balance + deposit;
                            System.out.println("Current balance is:" + "" + balance);
                            System.out.println("Your Money has been successfully deposited");
                            System.out.println("");
                            break;

                        case 3:
                            System.out.println("Balance : " + balance);
                            System.out.println("");
                            break;

                        case 4:
                            System.out.println();
                            System.out.println("THANKS FOR USING IBHAR BANK PLC");
                            System.exit(0);

                        case 5:
                            System.out.println("What Network?: 7-MTN, 8-GLO, 9-9M0BILE, 10-AIRTEL");
                            int Network = s.nextInt();

                            switch (Network) {
                                case 7:
                                    System.out.println("Enter Amount");
                                    TopUP = s.nextInt();
                                    System.out.println("Your TopUp was successful!");
                                    break;

                                case 8:

                                    System.out.println("Enter Amount");
                                    TopUP = s.nextInt();
                                    System.out.println("Your TopUp was successful!");
                                    break;

                                case 9:
                                    System.out.println("Enter Amount");
                                    TopUP = s.nextInt();
                                    System.out.println("Your TopUp was successful!");
                                    break;

                                case 10:
                                    System.out.println("Enter Amount");
                                    TopUP = s.nextInt();
                                    System.out.println("Your TopUp was successful!");
                                    break;

                                case 6:
                                    System.out.println("Please enter current year:");
                                    expiry = s.nextInt();
                                    if (expiry <= date) {
                                        System.out.println("Your Card is still Active");
                                    } else {
                                        System.out.println("Card Expired!");
                                    }
                            }
                    }
                }
            }
        }
    }
}


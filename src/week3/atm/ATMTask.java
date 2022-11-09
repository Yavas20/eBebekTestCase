package week3.atm;

import java.util.Scanner;

public class ATMTask {

    public static void main(String[] args) {

        String userName, password;
        Scanner scan = new Scanner(System.in);
        int selectOption, entryRight = 3,balance = 1500;

        while (entryRight > 0) {
            System.out.print("Enter your username : ");
            userName = scan.nextLine();

            System.out.print("Enter your password : ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to Patika Bank!");
                do {
                    System.out.println("For Depositing press 1, " +
                            "\nFor Withdrawing press 2,\nFor Asking balance press 3,\nFor Exit press 4\nEnter your transaction :");

                    selectOption = scan.nextInt();

                    switch (selectOption) {
                        case 1:
                            System.out.println("Amount of money for deposit : ");
                            int depositMoney = scan.nextInt();
                            balance += depositMoney;
                            System.out.print("Your balance is : " + balance + "\n");
                            break;
                        case 2:
                            System.out.println("Amount of money for withdraw : ");
                            int withdrawMoney = scan.nextInt();
                            if (withdrawMoney > balance) {
                                System.out.println("Insufficient balance !!!");
                                break;
                            } else {
                                balance -= withdrawMoney;
                                System.out.println("Your balance is : " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Your balance is : " + balance);
                            break;
                    }
                }while (selectOption != 4);
                    System.out.println("Thank you for selecting Patika Bank");
                    break;
            } else {
                entryRight--;
                System.out.println("Invalid username or password. Please re-enter your credentials.");
                if (entryRight == 0) {
                    System.out.println("Your account is blocked. Please communicate with customer service");
                } else {
                    System.out.println("Remaining right is : " + entryRight);
                }
            }
        }

    }
}

package week3.exponentialNumber;

import java.util.Scanner;

public class ExponentialNumberTask {

    public static void main(String[] args) {

        int number, exponent, sum = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please : ");

        number = scan.nextInt();

        System.out.println("Enter an exponent please : ");

        exponent = scan.nextInt();

        for (int i = 1; i <= exponent; i++) {

            sum *=number;

        }

        System.out.println("Total number is : " + sum);

    }
}
/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */
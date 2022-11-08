package week3.sumOfTheDigits;

import java.util.Scanner;

public class TheSumOfTheDigitsOfTheNumber {

    public static void main(String[] args) {

        int number, result =0, digitValue;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please : ");

        number = scan.nextInt();


        while(number != 0){

            digitValue = number % 10;
            result +=digitValue;

            number /= 10;

        }

        System.out.println(result);

    }

}
/*
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */
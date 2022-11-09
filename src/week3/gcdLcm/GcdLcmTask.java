package week3.gcdLcm;

import java.util.Scanner;

public class GcdLcmTask {

    public static void main(String[] args) {

        int number1, number2, gcd = 1, lcm = 1, i = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number : ");
        number1 = scan.nextInt();

        System.out.print("Enter second number : ");
        number2 = scan.nextInt();

        if (number1 < number2) {
            while (i <= number1) {

                if (number1 % i == 0 && number2 % i == 0) {
                    gcd = i;
                }
                i++;
            }

        } else {
            while (i <= number2) {

                if (number1 % i == 0 && number2 % i == 0) {
                    gcd = i;
                }
                i++;
            }
        }

        while (i <= number1*number2) {

            if (i % number1 == 0 && i % number2 == 0) {
                lcm = i;
                break;
            }

            i++;
        }

        System.out.println("Greatest Common Divisor is : " + gcd);
        System.out.println("lowest Common Multiple is : " + lcm);

    }
}
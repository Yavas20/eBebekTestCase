package week3.powerWithRecursive;

import java.util.Scanner;

public class PowerOfNumberWithRecursiveMethod {

    static int power(int base, int exponent) {

        if (exponent == 0)
            return 1;

        else if (base == 1)
            return 1;

        else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base number : ");
        int bottom = scan.nextInt();

        System.out.print("Enter the exponent number : ");
        int exponent = scan.nextInt();

        System.out.println("The result is = " + power(bottom, exponent));
    }
}
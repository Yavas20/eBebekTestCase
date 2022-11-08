package week3.harmonicSeries;

import java.util.Scanner;

public class HarmonicSeriesOfProvidedNumber {

    public static void main(String[] args) {

        int number;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number please : ");

        number = scan.nextInt();
        double result = 0;

        for (int i = 1; i <= number; i++) {

            result += (1.0/i);

        }

        System.out.println(result);

    }
}
/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.
 */
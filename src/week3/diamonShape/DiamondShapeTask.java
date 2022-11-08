package week3.diamonShape;

import java.util.Scanner;

public class DiamondShapeTask {

    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        n = scan.nextInt();


        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for ( int i = 1; i < n; i++) {
            for ( int k = 1; k <= i; k++) {
                System.out.print(" ");

            }
            for ( int j = 1; j <= ( 2 * n - (2 * i + 1) ); j++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }









    }
}
/*
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
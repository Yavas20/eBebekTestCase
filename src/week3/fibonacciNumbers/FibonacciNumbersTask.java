package week3.fibonacciNumbers;

import java.util.Scanner;

public class FibonacciNumbersTask {

    public static void main(String[] args) {

        int x = 0, num, y = 1, z;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        num = scan.nextInt();


        System.out.print(x + " " + y + " ");
        for(int i = 2; i <=num; i++) {
            z = x + y;
            x = y;
            y = z;
            System.out.print(z + " ");
        }

    }

}
// Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
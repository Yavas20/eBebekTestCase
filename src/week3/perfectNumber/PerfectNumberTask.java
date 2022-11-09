package week3.perfectNumber;

import java.util.Scanner;

public class PerfectNumberTask {

    public static void main(String[] args) {

        int number, sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        number = scan.nextInt();

        for (int i = 1; i < number; i++) {

            if(number % i == 0){
                sum +=i;
            }

        }

        if(number == sum){
            System.out.println(number + " is perfect number");
        }else{
            System.out.println(number + " is not perfect number");
        }

    }
}
/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
 */
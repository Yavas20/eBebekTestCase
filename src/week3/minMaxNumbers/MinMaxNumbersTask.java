package week3.minMaxNumbers;

import java.awt.*;
import java.util.Scanner;

public class MinMaxNumbersTask {

    public static void main(String[] args) {

        int countOfNumber;
        int maxNumber = Integer.MIN_VALUE;
        int minNUmber = Integer.MAX_VALUE;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the count of numbers : ");
        countOfNumber = scan.nextInt();

        for (int i = 1; i <=countOfNumber; i++) {

            System.out.println("Enter " + i + ". number : ");
            int number = scan.nextInt();

            if(number > maxNumber){
                maxNumber = number;
            }

            if(number < minNUmber ){
                minNUmber = number;
            }

        }

        System.out.println("The minimum number is : " + minNUmber);
        System.out.println("The maximum number is : " + maxNumber);

    }
}
//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
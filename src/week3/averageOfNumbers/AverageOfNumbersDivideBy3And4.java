package week3.averageOfNumbers;

import java.util.Scanner;

public class AverageOfNumbersDivideBy3And4 {

    public static void main(String[] args) {

        int providedNumber, countOfNumber = 0, sumOfNumber = 0;
        double average;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number please : ");

        providedNumber = scan.nextInt();

        for (int i = 1; i < providedNumber ; i++) {


            if(i % 12 == 0){

                countOfNumber ++;
                sumOfNumber +=i;
            }

        }

       average = sumOfNumber / countOfNumber;

        System.out.println(average);

    }

}
/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
sayıların ortalamasını hesaplayan programı yazınız.
 */
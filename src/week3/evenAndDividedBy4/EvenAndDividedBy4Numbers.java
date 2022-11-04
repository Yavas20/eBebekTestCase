package week3.evenAndDividedBy4;

import java.util.Scanner;

public class EvenAndDividedBy4Numbers {

    public static void main(String[] args) {

        int number, sum=0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Enter a number please : ");
            number = scan.nextInt();

            if(number % 4 == 0){
                sum +=number;
            }

        }while(number % 2 == 0);


        System.out.println("Total of numbers is : " + sum);


    }

}
/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */
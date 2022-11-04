package week3.exponentNumberOf4And5;

import java.util.Scanner;

public class ExponentNumbersOf4And5 {

    public static void main(String[] args) {

        int number;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please : ");

        number = scan.nextInt();

        for (int i = 1, k=1; i < number || k < number; i*=4) {

            System.out.println(i);

            if(k !=1){
                System.out.println(k);
            }

            k *=5;

            }

        }

    }

/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
package week3.combination;

import java.util.Scanner;

public class CombinationTask {

    public static void main(String[] args) {

        int number1, number2, number1Factorial = 1,number2Factorial = 1, lastFactorial = 1;
        
        double combination;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number please : ");

        number1 = scan.nextInt();

        System.out.println("Enter the second number please : ");

        number2 = scan.nextInt();

        for (int i = 1; i <= number1; i++) {
            number1Factorial *=i;
        }

        for (int i = 1; i <= number2; i++) {
            number2Factorial *=i;
        }

        for (int i = 1; i <= number1 - number2; i++) {
            lastFactorial *=i;
        }

        combination = number1Factorial / (number2Factorial * lastFactorial);

        System.out.println(combination);

    }
}
/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */
package week3.advancedCalculator;

import java.util.Scanner;

public class AdvancedCalculatorTask {

    static int sum(int a, int b) {
        int result = a + b;

        System.out.println("Total is : " + result);
        return result;
    }

    static int subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction is  : " + result);
        return result;
    }

    static int multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplying is : " + result);
        return result;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("The second number must be different from 0");
            return 0;
        }
        int result = a / b;
        System.out.println("Division is : " + result);
        return result;
    }

    static int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;

        }
        System.out.println("Power is  : " + result);
        return result;
    }

    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Factorial is : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Modulus is : " + result);
        return result;

    }

    static void rectangle(int a, int b) {
        System.out.println("Perimeter of rectangle is : " + (2 * (a + b)));
        System.out.println("Area of rectangle is : " + (a * b));

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition \n"
                + "2- Subtraction\n"
                + "3- Multiplying\n"
                + "4- Division\n"
                + "5- Exponentiation\n"
                + "6- Modulus\n"
                + "7- Area and Perimeter of Rectangle\n"
                + "0- Exit";
        System.out.println(menu);

        while (true) {
            System.out.println("================");
            System.out.print("Select an operation :");
            select = scan.nextInt();

            if (select == 0) {
                break;

            }
            System.out.print("First number please : ");
            int a = scan.nextInt();

            System.out.print("Second number please : ");
            int b = scan.nextInt();
            System.out.println("================");
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    subtract(a, b);
                    break;
                case 3:
                    multiply(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;

                case 6:
                    mod(a, b);
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Invalid operation !");

            }
        }
        System.out.println("Bye bye");
    }

}

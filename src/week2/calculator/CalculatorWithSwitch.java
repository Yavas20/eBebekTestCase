package week2.calculator;

import java.util.Scanner;

public class CalculatorWithSwitch {

    public static void main(String[] args) {

        double number1, number2;
        String addNumber = "+", subtractNumber = "-", multiplyNumber = "*", divideNumber = "/";
        String selectedOperation;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number :");
        number1 = scan.nextInt();

        System.out.println("Enter the second number :");
        number2 = scan.nextInt();

        System.out.println("Enter the wanted math operation");
        selectedOperation = scan.next();

        switch (selectedOperation){

            case "+":
                System.out.println("The result is : " + (number1 + number2));
                break;

            case "-":
                System.out.println("The result is : " + (number1 - number2));
                break;

            case "*":
                System.out.println("The result is : " + (number1 * number2));
                break;

            case "/":

                if(!(number2 == 0)){
                    System.out.println("The result is : " + (number1 / number2));
                    break;
                }else{
                    System.out.println("This is an invalid number - please re-enter the number !!!");
                    break;
                }

            default:
                System.out.println("This is an invalid operation - please re-enter the operation !!!");

        }



    }
}

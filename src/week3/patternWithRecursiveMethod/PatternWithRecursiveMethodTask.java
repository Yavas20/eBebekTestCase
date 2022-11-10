package week3.patternWithRecursiveMethod;

import java.util.Scanner;

public class PatternWithRecursiveMethodTask {

    static void patternMethod(int number, int result, int tempNumber) {
        if(tempNumber <= 0) {
            System.out.print(result + " ");
            result += 5;
            if(result == number) {
                System.out.print(result + " ");
                return;
            }
        }else if(tempNumber > 0) {
            System.out.print(result + " ");
            result -= 5;
            if (result <= 0) {
                tempNumber = result;
            }
        }
        patternMethod(number,result,tempNumber);
    }

    public static void main(String[] args) {

        int number, result, tempNumber;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = scan.nextInt();

        result = number;
        tempNumber = number;

        if(number == 0) {
            System.out.println("0 can not be used.");
        }else {
            patternMethod(number,result,tempNumber);
        }
    }
}

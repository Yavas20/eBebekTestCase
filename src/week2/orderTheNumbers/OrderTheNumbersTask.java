package week2.orderTheNumbers;

import java.util.Scanner;

public class OrderTheNumbersTask {
    public static void main(String[] args) {

        int x, y, z;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first number :");
        x= scan.nextInt();

        System.out.print("Please enter the second number :");
        y= scan.nextInt();

        System.out.print("Please enter the third number :");
        z= scan.nextInt();

        if(x > y && x > z){
            if(y > z){
                System.out.println("x > y > z");
            }else{
                System.out.println("x > z > y");
            }
        }else if(y > x && y > z){
            if(x > z){
                System.out.println("y > x > z");
            }else{
                System.out.println("y > z > x");
            }
        } else{
            if(x > y){
                System.out.println("z > x > y");
            }else{
                System.out.println("z > y > x");
            }
        }

    }
}

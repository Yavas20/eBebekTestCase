package week1.circle;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {

    public static void main(String[] args) {

        double radius;
        double piNumber = 3.14;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        radius = scan.nextInt();

        double area = piNumber * radius * radius;
        double perimeter = 2* piNumber * radius;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }

}

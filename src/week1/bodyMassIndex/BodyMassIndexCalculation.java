package week1.bodyMassIndex;

import java.util.Scanner;

public class BodyMassIndexCalculation {
    public static void main(String[] args) {

        double heightMeter, massIndex;
        int weight;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your height in meter : ");
        heightMeter = scan.nextDouble();

        System.out.print("Enter your wight in kg : ");
        weight = scan.nextInt();

        massIndex = weight / (heightMeter * heightMeter);
        System.out.println(massIndex);

    }
}

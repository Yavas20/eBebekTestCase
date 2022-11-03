package week2.activitiesPerWeather;

import java.util.Scanner;

public class PossibleActivitiesPerWeather {

    public static void main(String[] args) {

        int heat;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the heat degree :");

        heat = scan.nextInt();

        if(heat < 5) {
            System.out.println("You should go skiing");
        } else if ( heat <= 10) {
            System.out.println("You should go to cinema");
        } else if ( heat <= 15) {
            System.out.println("You should go to cinema or picnic");
        }else if ( heat <= 25) {
            System.out.println("You should go to picnic");
        } else {
            System.out.println("You should go swimming");
        }

    }

}

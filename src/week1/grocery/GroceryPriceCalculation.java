package week1.grocery;

import java.util.Scanner;

public class GroceryPriceCalculation {
    public static void main(String[] args) {

        double pearPrice = 2.14, applePrice = 3.67, tomatoePrice = 1.11,
                bananaPrice = 0.95, auberginePrice = 5, totalPrice;

        int pearKG, appleKG, tomatoeKG, bananaKG, aubergineKG;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter pear kg : ");
        pearKG = scan.nextInt();

        System.out.print("Enter apple kg : ");
        appleKG = scan.nextInt();

        System.out.print("Enter tomatoe kg : ");
        tomatoeKG = scan.nextInt();

        System.out.print("Enter banana kg : ");
        bananaKG = scan.nextInt();

        System.out.print("Enter aubergine kg : ");
        aubergineKG = scan.nextInt();

        totalPrice = (pearKG * pearPrice) + (appleKG * applePrice) + (tomatoeKG * tomatoePrice) +
                (bananaKG * bananaPrice) + (aubergineKG * applePrice);

        System.out.println("Total price is : " + totalPrice + " TL");

    }
}

package takximeter;

import java.util.Scanner;

public class TakximeterCalculation {
    public static void main(String[] args) {

        int km, startingPrice = 10;
        double totalPrice, perKmPrice = 2.20;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the distance : ");
        km = scan.nextInt();

        totalPrice = (km * perKmPrice) + startingPrice;

        totalPrice = totalPrice < 20 ? 20 : totalPrice;

        System.out.println("Total Price is : " + totalPrice);

    }

}

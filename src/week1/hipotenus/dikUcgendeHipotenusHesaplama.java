package week1.hipotenus;

import java.util.Scanner;

public class dikUcgendeHipotenusHesaplama {
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner scan = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = scan.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        b = scan.nextInt();

        c= Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs : " + c);

    }
}

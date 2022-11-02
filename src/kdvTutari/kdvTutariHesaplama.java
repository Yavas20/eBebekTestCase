package kdvTutari;

import java.util.Scanner;

public class kdvTutariHesaplama {

    public static void main(String[] args) {

        double tutar, kdvOrani = 0.18, kdvTutari, kdvliTutar;

        Scanner scan = new Scanner(System.in);
        System.out.print("Tutar giriniz : ");
        tutar = scan.nextDouble();
        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("Kdvsiz Tutar : " + tutar);
        System.out.println("Kdv oranı : " + kdvOrani);
        System.out.println("Kdv Tutarı : " + kdvTutari);
        System.out.println("Kdvli Tutar : " + kdvliTutar);



    }

}

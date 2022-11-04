package week2.chinaZodiac;

import java.util.Scanner;

public class ChinaZodiacTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int birthYear;

        System.out.print("Enter the year of birthday: ");

        birthYear = scan.nextInt();

        System.out.print("Your Chinese zodiac is : ");

        if (birthYear % 12 == 0) {
            System.out.println("MONKEY");
        } else if (birthYear % 12 == 1) {
            System.out.println("ROOSTER");
        } else if (birthYear % 12 == 2) {
            System.out.println("DOG");
        } else if (birthYear % 12 == 3) {
            System.out.println("PIG");
        } else if (birthYear % 12 == 4) {
            System.out.println("RAT");
        } else if (birthYear % 12 == 5) {
            System.out.println("BULLOCK");
        } else if (birthYear % 12 == 6) {
            System.out.println("TIGER");
        } else if (birthYear % 12 == 7) {
            System.out.println("RABBIT");
        } else if (birthYear % 12 == 8) {
            System.out.println("DRACO");
        } else if (birthYear % 12 == 9) {
            System.out.println("SNAKE");
        } else if (birthYear % 12 == 10) {
            System.out.println("HORSE");
        } else if (birthYear % 12 == 11) {
            System.out.println("SHEEP");
        }
    }

    }

 /*
 Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun

Senaryo

Doğum Yılınızı Giriniz : 1990
Çin Zodyağı Burcunuz : At
  */


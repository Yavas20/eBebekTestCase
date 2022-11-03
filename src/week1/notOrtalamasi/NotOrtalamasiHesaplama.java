package week1.notOrtalamasi;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = scan.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = scan.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = scan.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = scan.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = scan.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = scan.nextInt();

        String basariDurumu = ((mat + kimya + fizik + tarih + turkce + muzik) / 6.0) >= 60 ? "Başarılı" : "Başarısız";

        System.out.println(basariDurumu);


    }
}

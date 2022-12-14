package week2.flightTicketPrice;

import java.util.Scanner;

public class FlightTicketPriceTask {

    public static void main(String[] args) {

        int km, age, tripType;

        double perKMPrice = 0.10, normalPrice=0, ageDiscountAmount, totalPriceAfterAgeDiscount,
                roundTripDiscountAmount, totalPriceAfterRoundTripDiscount, totalPrice;

        double  discountAgeBelow12 = 0.50, discountAgeRange12To24 = 0.10,
                discountAgeAbove65 = 0.30, discountRoundTrip = 0.20;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the distance in km : ");
        km = scan.nextInt();

        if(km < 0){
            System.out.println("You enter invalid data !!!");
            throw new RuntimeException("Distance can not be negative number");
        }else{
            normalPrice += km * perKMPrice;
        }

        System.out.print("Please enter your age : ");
        age = scan.nextInt();

        if(age < 0){
            System.out.println("You enter invalid data !!!");
            throw new RuntimeException("Age can not be negative number");
        }else if(age < 12){
            ageDiscountAmount = normalPrice * discountAgeBelow12;
            totalPriceAfterAgeDiscount = normalPrice - ageDiscountAmount;
        }else if(age >12 && age <=24){
            ageDiscountAmount = normalPrice * discountAgeRange12To24;
            totalPriceAfterAgeDiscount = normalPrice - ageDiscountAmount;
        }else if(age > 24 && age < 65 ){
            ageDiscountAmount = 0;
            totalPriceAfterAgeDiscount = normalPrice - ageDiscountAmount;
        }else{
            ageDiscountAmount = normalPrice * discountAgeAbove65;
            totalPriceAfterAgeDiscount = normalPrice - ageDiscountAmount;
        }

        System.out.print("Please enter your trip type : ");
        tripType = scan.nextInt();

        if(!(tripType == 1 || tripType == 2)){
            System.out.println("You enter invalid data !!!");
            throw new RuntimeException("This trip type can nor be available");
        } else if(tripType == 1){
            roundTripDiscountAmount=0;
            totalPriceAfterRoundTripDiscount = totalPriceAfterAgeDiscount - roundTripDiscountAmount;
            totalPrice = totalPriceAfterRoundTripDiscount;
        } else{
            roundTripDiscountAmount = totalPriceAfterAgeDiscount * discountRoundTrip;
            totalPriceAfterRoundTripDiscount = totalPriceAfterAgeDiscount - roundTripDiscountAmount;
            totalPrice = totalPriceAfterRoundTripDiscount * 2;
        }

        System.out.println("Normal price is : " + normalPrice);
        System.out.println("Age discount amount is : " + ageDiscountAmount);
        System.out.println("Total price after age discount is : " + totalPriceAfterAgeDiscount);
        System.out.println("Round Trip discount amount is : " + roundTripDiscountAmount);
        System.out.println("Total price after round trip discount is : " + totalPriceAfterRoundTripDiscount);
        System.out.println("Total price is : " + totalPrice);

    }

}

/*
Java ile mesafeye ve ??artlara g??re u??ak bileti fiyat?? hesaplayan program?? yap??n. Kullan??c??dan Mesafe (KM), ya???? ve yolculuk tipi (Tek Y??n, Gidi??-D??n????) bilgilerini al??n. Mesafe ba????na ??cret 0,10 TL / km olarak al??n. ??lk olarak u??u??un toplam fiyat??n?? hesaplay??n ve sonras??nda ki ko??ullara g??re m????teriye a??a????daki indirimleri uygulay??n ;

Kullan??c??dan al??nan de??erler ge??erli (mesafe ve ya?? de??erleri pozitif say??, yolculuk tipi ise 1 veya 2) olmal??d??r. Aksi takdirde kullan??c??ya "Hatal?? Veri Girdiniz !" ??eklinde bir uyar?? verilmelidir.
Ki??i 12 ya????ndan k??????kse bilet fiyat?? ??zerinden %50 indirim uygulan??r.
Ki??i 12-24 ya??lar?? aras??nda ise bilet fiyat?? ??zerinden %10 indirim uygulan??r.
Ki??i 65 ya????ndan b??y??k ise bilet fiyat?? ??zerinden %30 indirim uygulan??r.
Ki??i "Yolculuk Tipini" gidi?? d??n???? se??mi?? ise bilet fiyat?? ??zerinden %20 indirim uygulan??r.
 */
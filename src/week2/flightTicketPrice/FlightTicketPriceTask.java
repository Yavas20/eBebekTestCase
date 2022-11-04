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
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */
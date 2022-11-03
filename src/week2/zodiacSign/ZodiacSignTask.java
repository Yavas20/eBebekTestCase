package week2.zodiacSign;

import java.util.Scanner;

public class ZodiacSignTask {
    public static void main(String[] args) {

        int month, day;
        String zodiac = " ";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter you month of birthday : ");
        month = input.nextInt();

        System.out.print("Enter you day of birthday : ");
        day = input.nextInt();

        if (day <= 31 && month <= 12) {
            if (month == 1) {
                if (day <= 21)
                    zodiac = "goat";
                else
                    zodiac = "aquarius";
            }
            if (month == 2) {
                if (day <= 19)
                    zodiac = "aquarius";
                else
                    zodiac = "pisces";
            }
            if (month == 3) {
                if (day <= 20)
                    zodiac = "pisces";
                else
                    zodiac = "aries";
            }
            if (month == 4) {
                if (day <= 20)
                    zodiac = "aries";
                else
                    zodiac = "taurus";
            }
            if (month == 5) {
                if (day <= 21)
                    zodiac = "taurus";
                else
                    zodiac = "gemini";
            }
            if (month == 6) {
                if (day <= 22)
                    zodiac = "gemini";
                else
                    zodiac = "cancer";
            }
            if (month == 7) {
                if (day <= 22)
                    zodiac = "cancer";
                else
                    zodiac = "leo";
            }
            if (month == 8) {
                if (day <= 22)
                    zodiac = "leo";
                else
                    zodiac = "virgo";
            }
            if (month == 9) {
                if (day <= 22)
                    zodiac = "virgo";
                else
                    zodiac = "libra";
            }
            if (month == 10) {
                if (day <= 22)
                    zodiac = "libra";
                else
                    zodiac = "scorpio";
            }
            if (month == 11) {
                if (day <= 21)
                    zodiac = "scorpio";
                else
                    zodiac = "sagittarius";
            }
            if (month == 12) {
                if (day <= 21)
                    zodiac = "sagittarius";
                else
                    zodiac = "goat";
            }
        } else
            isError = true;

        if (isError)
            System.out.println("You entered invalid data !!! ");
        else
            System.out.println("Your zodiac is: " + zodiac);
    }
}
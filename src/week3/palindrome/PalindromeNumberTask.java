package week3.palindrome;

import java.util.Scanner;

public class PalindromeNumberTask {

        public static void main (String[]args){
            int number;
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter a number : ");
            number = scan.nextInt();

            System.out.println(isPalindrome(number));

            scan.close();
        }

        public static boolean isPalindrome ( int number ){
            // Finding the reverse of the number
            int reverseNumber = 0;
            int temp = number;
            while (temp != 0) {
                reverseNumber = (reverseNumber * 10) + (temp % 10);
                temp /= 10;
            }
            if (reverseNumber == number) {  // Checking if the number and its  // reverse is equal
                return true;
            } else{
                return false;
            }



        }
    }

package week2.passingTheClass;

import java.util.Scanner;

public class PassOrFailClass {
    public static void main(String[] args) {

        int matScore, physicsScore, turkishScore, musicScore, chemicalScore, totalScore = 0;

        double averageScore;

        Scanner scan = new Scanner(System.in);

        System.out.print("Math score is :");
        matScore = scan.nextInt();

        if(matScore > 0 && matScore <= 100){
            totalScore +=matScore;
        }

        System.out.print("Physics score is :");
        physicsScore = scan.nextInt();

        if(physicsScore > 0 && physicsScore <= 100){
            totalScore +=physicsScore;
        }

        System.out.print("Turkish score is :");
        turkishScore = scan.nextInt();

        if(turkishScore > 0 && turkishScore <= 100){
            totalScore +=turkishScore;
        }

        System.out.print("Music score is :");
        musicScore = scan.nextInt();

        if(musicScore > 0 && musicScore <= 100){
            totalScore +=musicScore;
        }

        System.out.print("Chemical score is :");
        chemicalScore = scan.nextInt();

        if(chemicalScore > 0 && chemicalScore <= 100){
            totalScore +=chemicalScore;
        }

        averageScore = totalScore / 5;

        if(averageScore >= 55){
            System.out.println("You passed the class !!! - your average score is : " + averageScore);
        }else {
            System.out.println("You failed the class !!! - your average score is : " + averageScore);
        }


    }
}

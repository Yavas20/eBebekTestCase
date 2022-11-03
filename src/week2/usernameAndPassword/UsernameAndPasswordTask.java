package week2.usernameAndPassword;

import java.util.Scanner;

public class UsernameAndPasswordTask {

    public static void main(String[] args) {

        String userNameRequired, passwordRequired, resetPassword, newPassword;

        String userName = "patika" , password = "java1234";

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the usernamme :");
        userNameRequired = scan.nextLine();

        System.out.print("Please enter the password :");
        passwordRequired = scan.nextLine();

        if(userNameRequired.equals(userName)){
            if(!passwordRequired.equals(password)){

                System.out.println("Do you want to reset your password ?");
                resetPassword = scan.nextLine();
                if(resetPassword.equals("yes")){
                    System.out.print("Please enter the new password :");
                    newPassword = scan.nextLine();
                    if(!newPassword.equals(password)){
                        System.out.println("New password created");
                    }else{
                        System.out.println("New password is not created - Please re-enter new password");
                    }

                }else if(resetPassword.equals("no")){

                    System.out.println("Please re-enter your password !!!");
                }

            }else{
                System.out.println("You can logged in successfully !!!");
            }
        } else{
            System.out.println("Invalid username !!! - Please re-enter the username");
        }

    }

}

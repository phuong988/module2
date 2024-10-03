package src.ss19.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your email:");
            String email = scanner.nextLine();
            System.out.println("Enter your password:");
            String password = scanner.nextLine();
            if(EmailValidation.checkEmail(email) && PasswordValidation.checkPassword(password)) {
                System.out.println("Register account successfully!");
                break;
            } else {
                System.out.println("Invalid email or password! Please try again.");
            }
        }
    }
}


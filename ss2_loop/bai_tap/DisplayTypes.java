package ss2_loop.bai_tap;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. print the rectangle");
            System.out.println("2. print the square triangle");
            System.out.println("3. print the triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (choice == 2) {
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (5 - i + 1); j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= (5 - i + 1); j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
            } else if (choice == 3) {
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (choice == 4) {
                System.exit(0);
            }
        }
    }

}

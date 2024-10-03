package src.ss19.bai_tap.validate_name_classroom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the classroom: ");
        String nameClassroom = scanner.nextLine();
        if (Classroom.checkNameClassroom(nameClassroom)) {
            System.out.println("Classroom name is valid.");
        } else {
            System.out.println("Classroom name is invalid. Please enter a valid name.");
        }
    }
}

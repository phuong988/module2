package src.ss15.thuc_hanh.Debug;

import java.util.Scanner;

public class SolveFirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the value of b: ");
        double b = Double.parseDouble(scanner.nextLine());

        if (a == 0 ) {
            if(b == 0) {
                System.out.println("Equation has infinite solutions");
            }else {
                System.out.println("No solution");
            }
        } else {
            if(b == 0) {}
            double x = -b/a;
            System.out.println("The solution is x = " + x);
        }
    }
}

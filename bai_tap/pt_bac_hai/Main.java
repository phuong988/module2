package ss4_oop.bai_tap.pt_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the number b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the number c: ");
        double c = sc.nextDouble();
        QuadraticEquation quaDra = new QuadraticEquation(a, b, c);
        double delta = quaDra.getDiscriminant();
        if (delta > 0) {
            System.out.println("The quadratic equation has a solution");
            System.out.println("r1: " + quaDra.getRoot1());
            System.out.println("r2: " + quaDra.getRoot2());
        } else if (delta == 0) {
            System.out.println("The quadration has one root " + quaDra.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

    }
}

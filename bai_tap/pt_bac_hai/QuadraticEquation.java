package ss4_oop.bai_tap.pt_bac_hai;

import java.util.Scanner;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getterA() {
        return this.a;
    }

    public double getterB() {
        return this.b;
    }

    public double getterC() {
        return this.c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        return r2;
    }
}

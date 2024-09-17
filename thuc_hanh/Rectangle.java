package ss4_oop.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.print("you Rectangle \n" + rectangle.display());
        System.out.print("Perimeter of the Rectangle:" + rectangle.getPerimeter());
        System.out.println("The area of the rectangle is " + rectangle.getArea());
    }

    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }

}



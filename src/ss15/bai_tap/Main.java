package src.ss15.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;

        try {
            System.out.println(" Nhập cạnh thứ nhất: ");
            side1 = scanner.nextDouble();

            System.out.println("Nhập cạnh thứ hai: ");
            side2 = scanner.nextDouble();

            System.out.println("Nhập cạnh thứ ba: ");
            side3 = scanner.nextDouble();

            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Tam giác hợp lệ với các cạnh: " + side1 + ", " + side2 + ", " + side3);
        } catch (IllegalTriangleException e) {
            System.out.println(" Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Đẫ xảy ra lỗi. Vui lòng nhập số hợp lệ ");
        } finally {
            scanner.close();
        }
    }
}

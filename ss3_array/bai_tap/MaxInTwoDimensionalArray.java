package ss3_array.bai_tap;

import java.util.Scanner;

public class MaxInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int cols = sc.nextInt();

        int[][] array = new int[row][cols];
        // Nhap cac phan tu vao mang
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        // In mang hai chieu
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // tim gia tri lon nhat trong mang
        int max = array[0][0];
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The maximum element is " + max);
        sc.close();
    }
}

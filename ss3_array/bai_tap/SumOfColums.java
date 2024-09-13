package ss3_array.bai_tap;

import java.util.Scanner;

public class SumOfColums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the array: ");
        int row = sc.nextInt();
        System.out.println("Enter the column of the array: ");
        int col = sc.nextInt();

        double[][] array = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element at index [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextDouble();
            }
        }

        double sum = 0;
        System.out.println("What column do you want to calculate the sum of?: ");
        int n = sc.nextInt();
        while (n < 0 || n > row) {
            n = sc.nextInt();
        }
        for (int i = 0; i < col; i++) {
            sum += array[i][n];
        }
        System.out.println("The sum of the columns of the array is: " + sum);
    }
}


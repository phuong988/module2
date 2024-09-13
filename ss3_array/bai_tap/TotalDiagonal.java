package ss3_array.bai_tap;

import java.util.Scanner;

public class TotalDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        double[][] array = new double[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println("Enter the element at position [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextDouble();
            }
        }
        System.out.println("The total diagonal is: ");
        double sumDiagonal = 0;
        double sumSecondaryDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumDiagonal += array[i][i];
            sumSecondaryDiagonal += array[i][n - 1 - i];
        }
        double totalDiagonal = sumDiagonal + sumSecondaryDiagonal;
        System.out.println("The total diagonal is: " + totalDiagonal);

    }
}

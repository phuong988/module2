package ss3_array.bai_tap;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at number " + (i + 1) + " of the array");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element is " + min);
    }
}

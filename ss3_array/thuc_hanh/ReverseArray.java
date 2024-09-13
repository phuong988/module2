package ss3_array.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int n = sc.nextInt();
        while (n > 20) {
            System.out.println("Nhập lại số lượng các phần tử (<20): ");
             n = sc.nextInt();
        }
        int[] array = new int[n];
        for (int i  = 0; i < n; i++) {
            System.out.print("số thứ "+ (i+1)+" trong mảng là:");
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Pần tử trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int temp = 0;
        for (int  i = 0; i < n/2; i++) {
            temp = array[ i];
            array[ i ] = array[ n -1 - i];
            array[ n -1 - i] = temp;
        }
        System.out.printf("%-20s%s", "mảng dối xứng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

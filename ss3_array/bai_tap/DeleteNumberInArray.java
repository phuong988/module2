package ss3_array.bai_tap;

import java.util.Scanner;

public class DeleteNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số muốn xóa: ");
        int n = sc.nextInt();
        int indexDel = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                indexDel = i;
                break;
            }
        }
        if (indexDel == -1) {
            System.out.print("không tìm thấy số " + n + " trong mảng!");
        } else {
            for (int i = indexDel; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            // giảm kích thước mảng
            int[] newArray = new int[array.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            System.out.printf("mảng sau khi xóa %d: ", n);
            for (int j = 0; j < newArray.length; j++) {
                System.out.print(newArray[j] + "\t");
            }
        }
        sc.close();
    }
}

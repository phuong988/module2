package ss3_array.bai_tap;

import java.util.Scanner;

public class AddElementsToTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element number " + (i + 1) + " of the array");
            arr[i] = sc.nextInt();
        }
        // in các phần tử trong mảng vừa nhâp
        System.out.println("the elements in the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Nhập số và chỉ số để chèn
        System.out.println("Enter the number you want to add: ");
        int add = sc.nextInt();
        System.out.println("Enter the index to insert: ");
        int index = sc.nextInt();
        while (index < 0 || index > n) {
            System.out.println("Re-enter the index to insert: ");
            index = sc.nextInt();
        }


//        int[] newArr = new int[arr.length+1]; // tạo mảng có kích thước lơn hơn
//        // sao chép các phần tử trước chỉ số index
//        for (int i = 0; i < index; i++) {
//            newArr[i] = arr[i];
//        }
//        // chen phan tu mới
//        newArr[index] = add;
//        //sao chep các phan tử sau index
//        for (int i = index; i < arr.length; i++) {
//            newArr[i+1] = arr[i];
//        }
        int[] newArr = new int[n + 1];
        System.arraycopy(arr, 0, newArr, 0, index); // sao chép phẩn tử trước index
        newArr[index] = add; // chèn phan tu mới
        System.arraycopy(arr, index, newArr, index + 1, n - index); // sao chép phần tử sau index

        System.out.println("the array after adding is : ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

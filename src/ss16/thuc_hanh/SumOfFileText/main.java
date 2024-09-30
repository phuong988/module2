package src.ss16.thuc_hanh.SumOfFileText;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}

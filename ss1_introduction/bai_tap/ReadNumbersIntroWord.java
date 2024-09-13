package ss1_introduction.bai_tap;

import java.util.Scanner;

public class ReadNumbersIntroWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int n = sc.nextInt();
        while (n <= 0 || n > 999) {
            System.out.print("nhập lại n cho đúng: ");
            n = sc.nextInt();
        }
        if (n < 10) {
            switch (n) {
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bốn");
                    break;
                case 5:
                    System.out.println("Năm");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("Bảy");
                    break;
                case 8:
                    System.out.println("Tám");
                    break;
                case 9:
                    System.out.println("Chín");
                    break;
            }
        } else if (n < 20 && n > 10) {
            switch (n) {
                case 11:
                    System.out.println("Mười Một");
                    break;
                case 12:
                    System.out.println("Mười Hai");
                    break;
                case 13:
                    System.out.println("Mười Ba");
                    break;
                case 14:
                    System.out.println("Mười Bốn");
                    break;
                case 15:
                    System.out.println("Mười Năm");
                    break;
                case 16:
                    System.out.println("Mười Sáu");
                    break;
                case 17:
                    System.out.println("Mười Bảy");
                    break;
                case 18:
                    System.out.println("Mười Tám");
                    break;
                case 19:
                    System.out.println("Mười Chín");
                    break;
            }
        } else if (n >= 20 && n < 100) {

            switch (n / 10) {
                case 2:
                    System.out.print("Hai mươi");
                    break;
                case 3:
                    System.out.print("Ba mươi");
                    break;
                case 4:
                    System.out.print("Bốn mươi");
                    break;
                case 5:
                    System.out.print("Năm mươi");
                    break;
                case 6:
                    System.out.print("Sáu mươi");
                    break;
                case 7:
                    System.out.print("Bảy mươi");
                    break;
                case 8:
                    System.out.print("Tám mươi");
                    break;
                case 9:
                    System.out.print("Chín mươi");
                    break;
            }
            switch (n % 10) {
                case 1:
                    System.out.println(" Mốt");
                    break;
                case 2:
                    System.out.println(" Hai");
                    break;
                case 3:
                    System.out.println(" Ba");
                    break;
                case 4:
                    System.out.println(" Bốn");
                    break;
                case 5:
                    System.out.println(" Năm");
                    break;
                case 6:
                    System.out.println(" Sáu");
                    break;
                case 7:
                    System.out.println(" Bảy");
                    break;
                case 8:
                    System.out.println(" Tám");
                    break;
                case 9:
                    System.out.println(" Chín");
                    break;
            }
        } else if (n >= 100) {
            switch (n / 100) {
                case 1:
                    System.out.print("Một trăm");
                    break;
                case 2:
                    System.out.print("Hai trăm");
                    break;
                case 3:
                    System.out.print("Ba trăm");
                    break;
                case 4:
                    System.out.print("Bốn trăm");
                    break;
                case 5:
                    System.out.print("Năm trăm");
                    break;
                case 6:
                    System.out.print("Sáu trăm");
                    break;
                case 7:
                    System.out.print("Bảy trăm");
                    break;
                case 8:
                    System.out.print("Tám trăm");
                    break;
                case 9:
                    System.out.print("Chín trăm");
                    break;
            }
            switch (n % 100 / 10) {
                case 2:
                    System.out.print(" Hai mươi");
                    break;
                case 3:
                    System.out.print(" Ba mươi");
                    break;
                case 4:
                    System.out.print(" Bốn mươi");
                    break;
                case 5:
                    System.out.print(" Năm mươi");
                    break;
                case 6:
                    System.out.print(" Sáu mươi");
                    break;
                case 7:
                    System.out.print(" Bảy mươi");
                    break;
                case 8:
                    System.out.print(" Tám mươi");
                    break;
                case 9:
                    System.out.print(" Chín mươi");
                    break;
            }
            switch (n % 100 % 10) {
                case 1:
                    System.out.println(" Mốt");
                    break;
                case 2:
                    System.out.println(" Hai");
                    break;
                case 3:
                    System.out.println(" Ba");
                    break;
                case 4:
                    System.out.println(" Bốn");
                    break;
                case 5:
                    System.out.println(" Năm");
                    break;
                case 6:
                    System.out.println(" Sáu");
                    break;
                case 7:
                    System.out.println(" Bảy");
                    break;
                case 8:
                    System.out.println(" Tám");
                    break;
                case 9:
                    System.out.println(" Chín");
                    break;
            }

        }
    }
}

package ss4_oop.bai_tap.stop_watch;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        int n = 100000; // Số lượng phần tử
        int[] array = new int[n]; // Tạo mảng với kích thước 100,000
        Random random = new Random();

        // Tạo mảng ngẫu nhiên
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100000); // Số ngẫu nhiên từ 0 đến dưới 100000
        }

        StopWatch stopwatch = new StopWatch(); // Khởi tạo stopwatch
        stopwatch.start(); // Bắt đầu đo thời gian

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Cập nhật chỉ số của phần tử nhỏ nhất
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }


        stopwatch.stop();
        System.out.println("Thời gian thực thi: " + stopwatch.getElapsedTime() + " ms");

    }
}

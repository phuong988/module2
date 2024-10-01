package src.ss17.bai_tap.CopyBinaryFile;

import java.io.File;
import java.io.*;

public class CopyBinaryFile {

    public static void main(String[] args) {
        String sourcePath = "D:\\codegym\\module2\\src\\src\\ss17\\bai_tap\\CopyBinaryFile\\source.txt";  // Đường dẫn tới tệp nguồn
        String targetPath = "D:\\codegym\\module2\\src\\src\\ss17\\bai_tap\\CopyBinaryFile\\target.txt";  // Đường dẫn tới tệp đích

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra tệp nguồn có tồn tại không
        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
            return;
        }

        // Kiểm tra tệp đích đã tồn tại chưa
        if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại.");
            return;
        }

        // Sao chép tệp
        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(targetFile)) {

            byte[] buffer = new byte[1024]; // Bộ nhớ đệm 1KB
            int bytesRead;
            int totalBytes = 0;

            // Đọc từng byte từ tệp nguồn và ghi vào tệp đích
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Sao chép thành công! Tổng số byte: " + totalBytes);

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi trong quá trình sao chép: " + e.getMessage());
        }
    }
}

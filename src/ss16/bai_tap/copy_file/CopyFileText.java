package src.ss16.bai_tap.copy_file;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Nhập tập tin nguồn và tập tin đích từ người dùng
            System.out.print("Nhập đường dẫn tập tin nguồn: ");
            String sourcePath = reader.readLine();
            System.out.print("Nhập đường dẫn tập tin đích: ");
            String targetPath = reader.readLine();

            // Tạo đối tượng File cho tập tin nguồn và đích
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);

            // Kiểm tra sự tồn tại của tập tin nguồn
            if (!sourceFile.exists()) {
                System.out.println("Tập tin nguồn không tồn tại.");
                return;
            }

            // Kiểm tra xem tập tin đích đã tồn tại hay chưa
            if (targetFile.exists()) {
                System.out.println("Tập tin đích đã tồn tại. Vui lòng chọn một tên khác.");
                return;
            }

            // Đọc từ tệp nguồn và ghi vào tệp đích
            try (FileReader fileReader = new FileReader(sourceFile);
                 FileWriter fileWriter = new FileWriter(targetFile)) {

                int character;
                int count = 0;

                while ((character = fileReader.read()) != -1) {
                    fileWriter.write(character);
                    count++;
                }

                System.out.println("Sao chép thành công! Số ký tự trong tệp: " + count);
            }

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}

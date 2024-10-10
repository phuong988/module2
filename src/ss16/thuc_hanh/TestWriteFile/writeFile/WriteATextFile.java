package src.ss16.thuc_hanh;

import src.ss16.thuc_hanh.TestWriteFile.Student;

import java.io.*;

public class WriteATextFile {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\codegym\\module2\\src\\src\\ss16\\thuc_hanh\\TestWriteFile\\writeFile.txt", "UTF-8");
            pw.println("Hello, World!");
            pw.println();
            Student student = new Student(1234,"phuong");
            pw.println(student);
            pw.println();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

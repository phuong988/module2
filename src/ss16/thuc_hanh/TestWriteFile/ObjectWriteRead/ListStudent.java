package ss20.thuc_hanh.StudentManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent {
    private ArrayList<Student> listStudent;

    public ListStudent() {
        this.listStudent = new ArrayList<Student>();
    }

    public ListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public void addStuddent(Student student) {
        this.listStudent.add(student);
    }
    // in listStudent
    public void showListStudent() {
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

    //kiem tra danh sach rong
    public boolean isEmpty() {
        return this.listStudent.isEmpty();
    }

    // lay ra so luong sinh vien trong danh sach
    public int getSize() {
        return this.listStudent.size();
    }

    // lam rong danh sach sinh vien
    public void clearList() {
        this.listStudent.removeAll(listStudent);
    }

    // kt phan tu có tồn tại không  theo id
    public boolean checkStudentById(Student student) {
        return this.listStudent.contains(student);
    }

    // xoa 1 sv ra khoi danh sach
    public boolean removeStudent(Student student) {
        return this.listStudent.remove(student);
    }

    // tim sv dua theo ten
    public void findStudentByName(String tenSinhVien) {
        for (Student student : listStudent) {
            if(student.getHoVaTen().equalsIgnoreCase(tenSinhVien)) {
                System.out.println(student);
            }
        }
    }

    //show danh sach sinh vien diem tu cao den thap
    public void showStudentByScore() {
        Collections.sort(this.listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if(student1.getDiemTrungBinh() < student2.getDiemTrungBinh()) {
                    return 1;
                }else if( student1.getDiemTrungBinh() > student2.getDiemTrungBinh()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        } );
    }


}

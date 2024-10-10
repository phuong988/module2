package ss20.thuc_hanh.StudentManagement;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String id;
    private String hoVaTen;
    private int namSinh;
    private Double diemTrungBinh;

    public Student(String id, String hoVaTen, int namSinh, double diemTrungBinh) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public Student(String id) {
        this.id = id;

    }

    public Student() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public Double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}

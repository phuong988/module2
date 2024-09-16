package out.production.module2.ss5_modifier.bai_tap.write_only;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", classes='" + classes + '\'' + '}';
    }
}

package src.ss15.bai_tap;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Cạnh không thể là số âm hoặc bằng 0.");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng của hai cạnh không lớn hơn cạnh còn lại.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}

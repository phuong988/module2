package src.ss9_testing.thuc_hanh.triangle_classification;

public class TriangleClassifier {
    public String classifyTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            return "Không phải là tam giác";
        } else if (a == b && b == c) {
            return "Tam giác đều";
        } else if (a == b || b == c || a == c) {
            return "Tam giác cân";
        } else {
            return "Tam giác thường";
        }
    }

}

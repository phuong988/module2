package src.ss6_inheritance.bai_tap.circle_cylinder;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "balck");
        System.out.println(circle);
        circle.setRadius(4);
        System.out.println(circle);
        circle.setColor("red");
        System.out.println(circle);
        System.out.println("-------------------------------------------------------------");

        Cylinder cylinder = new Cylinder(1, "blue", 3);
        System.out.println(cylinder);
        System.out.println("height = " + cylinder.getHeight());
        cylinder.setHeight(6);
        System.out.println(cylinder);
    }
}

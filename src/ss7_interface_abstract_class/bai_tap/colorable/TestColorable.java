package src.ss7_interface_abstract_class.bai_tap.colorable;

import out.production.module2.ss6_inheritance.bai_tap.circle_cylinder.Rectangle;
import out.production.module2.ss6_inheritance.bai_tap.circle_cylinder.Shape;
import src.ss6_inheritance.bai_tap.circle_cylinder.Circle;
import src.ss6_inheritance.thuc_hanh.Square;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(2.0, 3.0);
        shapes[2] = new Square(4.0);

        for (Shape shape : shapes) {
            System.out.println(shape.Area());
        }

        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}

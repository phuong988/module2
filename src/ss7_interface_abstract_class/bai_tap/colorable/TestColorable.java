package src.ss7_interface_abstract_class.bai_tap.colorable;

import src.ss6_inheritance.thuc_hanh.Shape;
import src.ss6_inheritance.thuc_hanh.Square;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape(2.0, 2.0);
        shapes[1] = new Shape(2.0, 3.0);
        shapes[2] = new Square(4.0);


        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}

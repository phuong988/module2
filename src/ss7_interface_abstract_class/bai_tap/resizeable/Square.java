package src.ss7_interface_abstract_class.bai_tap.resizeable;

public class Square extends Shape{
    private double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide()
    {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}

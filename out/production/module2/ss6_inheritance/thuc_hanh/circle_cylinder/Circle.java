package out.production.module2.ss6_inheritance.thuc_hanh.circle_cylinder;

class Circle extends Shape {
    private double radius;
    Circle() {
        this.radius = 1.0;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with{" +
                "radius=" + radius +", Which is a subclass of "+ super.toString() +
                '}';
    }
}

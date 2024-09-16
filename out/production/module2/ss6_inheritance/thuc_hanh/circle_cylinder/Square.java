package out.production.module2.ss6_inheritance.bai_tap.circle_cylinder;

public class Square extends Rectangle{


    public Square(double size){
        super(size, size);
    }
    public Square(double size, String color, boolean filled){

    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +"Which is a subclass of " + supper.toString()
                +'}';
    }
}

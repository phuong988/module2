package src.ss6_inheritance.bai_tap.point2dd_point3d;

public class main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(2.0f, 2.0f);
        System.out.println(point);
        point.setX(2.0f);
        System.out.println(point);
        point.setXY(4.5f, 7.0f);
        System.out.println(point);
        System.out.println("float[] arr: ");
        for (int i = 0; i < point.getXY().length; i++) {
            System.out.print(point.getXY()[i] + " ");
        }
        System.out.println("\n----------------------------------------------------");
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(2.0f, 2.0f);
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(2.0f, 4.0f, 3.5f, 5.0f);
        System.out.println(movablePoint);
        movablePoint.setYSpeed(2.0f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);

        Point p1 = new MovablePoint();
        System.out.println(p1);
        MovablePoint p2 = (MovablePoint) p1;
        p2 = new MovablePoint(3.0f, 5.0f, 5.0f, 7.0f);
        System.out.println(p2);
        System.out.println(p2.getYSpeed());

    }
}

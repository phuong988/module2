package src.ss6_inheritance.bai_tap.point2d_point3d;

public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3.0f,2.0f);
        System.out.println(point2D);
        point2D.setX(4.0f);
        System.out.println(point2D);
        System.out.println("-------------------------------------------");

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3.3f, 6.7f, 4.5f);
        System.out.println(point3D);
        point3D.setZ(3f);
        System.out.println(point3D);
        point2D.setX(4.0f);
        System.out.println(point3D);
        System.out.println(point2D);
        System.out.println("-----------------------------");
        point3D.getXYZ();
        for (float item : point3D.getXYZ()) {
            System.out.print(item + " ");
        }
    }
}

package ss4_oop.bai_tap.fan;

public class main {
    public static void main(String[] args) {
        Fan fanA = new Fan(Fan.FAST, true, 10, "yellow");
        System.out.println(fanA.infoString());
        Fan fanB = new Fan(Fan.MEDIUM, false, 5, "blue");
        System.out.println(fanB.infoString());
    }
}


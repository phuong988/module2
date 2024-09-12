package ss4_oop.bai_tap.stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;
//    public  long getStarTime() {
//        return startTime;
//    }
//    public  long getEndTime() {
//        return endTime;
//    }
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

}


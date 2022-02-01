package Lab4;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        this.start();
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}

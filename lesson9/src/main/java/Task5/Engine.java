package Task5;

public class Engine {
    private boolean isStarted = false;

    public void start() {
        this.isStarted = true;
        System.out.println("Engine started!");
    }

    public void stop() {
        this.isStarted = false;
        System.out.println("Engine stopped!");
    }
}

package Task5;

public class CarEngine implements Engine {
    private boolean isStarted = false;

    @Override
    public void start() {
        this.isStarted = true;
        System.out.println("Engine started!");
    }

    @Override
    public void stop() {
        this.isStarted = false;
        System.out.println("Engine stopped!");
    }
}

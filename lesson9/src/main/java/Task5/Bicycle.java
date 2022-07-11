package Task5;

public class Bicycle implements Vehicle {

    private boolean isMoving = false;

    @Override
    public void start() {
        this.isMoving = true;
    }

    @Override
    public void stop() {
        this.isMoving = false;
    }
}

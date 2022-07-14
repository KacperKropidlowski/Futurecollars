package Task5;

public class Car implements Vehicle {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    private boolean isMoving = false;

    @Override
    public void start() {
        if (isMoving) {
            System.out.println("Already started!");
        } else {
            engine.start();
            this.isMoving = true;
            System.out.println("Enjoy your ride!");
        }
    }

    @Override
    public void stop() {
        if (!isMoving) {
            System.out.println("Already stopped!");
        } else {
            engine.stop();
            this.isMoving = false;
            System.out.println("Car stopped!");
        }
    }
}

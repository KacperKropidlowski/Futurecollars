package Task5;

public class Car implements Vehicle {

    CarEngine carEngine = new CarEngine();

    private boolean isMoving = false;

    @Override
    public void start() {
        if (isMoving) {
            System.out.println("Already started!");
        } else {
            carEngine.start();
            this.isMoving = true;
            System.out.println("Enjoy your ride!");
        }
    }

    @Override
    public void stop() {
        if (!isMoving) {
            System.out.println("Already stopped!");
        } else {
            carEngine.stop();
            this.isMoving = false;
            System.out.println("Car stopped!");
        }
    }
}

package Task5;

public class Car implements Vehicle, Engine {

    private boolean isEngineStarted = false;
    private boolean isCarRiding = false;

    public void setEngineStarted(boolean engineStarted) {
        isEngineStarted = engineStarted;
    }

    public void setCarRiding(boolean carRiding) {
        isCarRiding = carRiding;
    }

    @Override
    public void startEngine() {
        setEngineStarted(true);
        System.out.println("Engine started!");
    }

    @Override
    public void stopEngine() {
        if (isCarRiding) {
            System.out.println("Stop car first!");
        } else {
            setEngineStarted(false);
            System.out.println("Engine stopped!");
        }
    }

    @Override
    public void start() {
        if (isEngineStarted) {
            setCarRiding(true);
            System.out.println("Enjoy Your car ride!");
        } else {
            System.out.println("Turn on engine first!");
        }
    }

    @Override
    public void stop() {
        if (isCarRiding) {
            setCarRiding(false);
            System.out.println("Car stopped!");
        } else {
            System.out.println("It is impossible to stop a car that is not riding!");
        }

    }
}

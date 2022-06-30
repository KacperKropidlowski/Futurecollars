package Task5;

public class Bicycle implements Vehicle {

    private boolean isBicycleRiding = false;

    public void setBicycleRiding(boolean bicycleRiding) {
        isBicycleRiding = bicycleRiding;
    }

    @Override
    public void start() {
        setBicycleRiding(true);
        System.out.println("Enjoy Your bike ride!");
    }

    @Override
    public void stop() {
        if (isBicycleRiding){
            setBicycleRiding(false);
            System.out.println("Bicycle stopped!");
        } else {
            System.out.println("It is impossible to stop a bicycle that is not riding!");
        }
    }
}

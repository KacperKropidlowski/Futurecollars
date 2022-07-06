package Task1;

public class CinemaSeat {
    private final int number;
    private final int row;
    private boolean isTaken;

    public CinemaSeat(int number, int row) {
        this.number = number;
        this.row = row;
        this.isTaken = false;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }
}

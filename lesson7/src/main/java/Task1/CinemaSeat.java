package Task1;

public class CinemaSeat {
    private final int number;
    private final int row;
    static boolean isTaken;

    public CinemaSeat(int number, int row) {
        this.number = number;
        this.row = row;
        this.isTaken = false;
    }
    public static void setIsTaken(boolean isTaken) {
        CinemaSeat.isTaken = isTaken;
    }
}

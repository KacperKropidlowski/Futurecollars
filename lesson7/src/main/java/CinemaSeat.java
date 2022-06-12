public class CinemaSeat {
    private int number;
    private int row;
    boolean freeOrTaken;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public CinemaSeat(boolean freeOrTaken) {
        this.freeOrTaken = freeOrTaken;
    }
}

package Task3;

public class CinemaHall {
    private final String name;
    private final CinemaHallType cinemaHallType;

    public CinemaHall(String name, CinemaHallType cinemaHallType) {
        this.name = name;
        this.cinemaHallType = cinemaHallType;
    }

    public String getName() {
        return name;
    }

    public CinemaHallType getCinemaHallType() {
        return cinemaHallType;
    }
}

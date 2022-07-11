package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CinemaHallSorter {
    public static void main(String[] args) {
        CinemaHall hall1 = new CinemaHall("Cinema Hall 1", "2D");
        CinemaHall hall2 = new CinemaHall("Cinema Hall 2", "3D");
        CinemaHall hall3 = new CinemaHall("Cinema Hall 3", "2D");
        CinemaHall hall4 = new CinemaHall("Cinema Hall 4", "2D");
        CinemaHall hall5 = new CinemaHall("Cinema Hall 5", "3D");
        CinemaHall hall6 = new CinemaHall("Cinema Hall 6", "4D");
        CinemaHall hall7 = new CinemaHall("Cinema Hall 7", "3D");
        CinemaHall hall8 = new CinemaHall("Cinema Hall 8", "2D");
        CinemaHall hall9 = new CinemaHall("Cinema Hall 9", "4D");
        CinemaHall hall10 = new CinemaHall("Cinema Hall 10", "2D");
        List<CinemaHall> cinemaHallList = Arrays.asList(hall1, hall2, hall3, hall4, hall5, hall6, hall7, hall8, hall9, hall10);

        System.out.println("Cinema halls sorted by cinema hall type:");
        cinemaHallList
                .stream()
                .sorted(Comparator.comparing(CinemaHall::getCinemaHallType))
                .forEach(cinemaHall -> System.out.println(cinemaHall.getName()));

        System.out.println("\n2D Cinema halls:");
        System.out.println(cinemaHallList
                .stream()
                .filter(cinemaHall -> cinemaHall.getCinemaHallType().equals("2D"))
                .count());

        System.out.println("\n3D Cinema halls:");
        System.out.println(cinemaHallList
                .stream()
                .filter(cinemaHall -> cinemaHall.getCinemaHallType().equals("3D"))
                .count());

        System.out.println("\n4D Cinema halls:");
        System.out.println(cinemaHallList
                .stream()
                .filter(cinemaHall -> cinemaHall.getCinemaHallType().equals("4D"))
                .count());
    }
}

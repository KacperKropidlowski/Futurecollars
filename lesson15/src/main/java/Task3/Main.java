package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        CinemaHall hall1 = new CinemaHall("Cinema Hall 1", CinemaHallType.TwoDimensional);
        CinemaHall hall2 = new CinemaHall("Cinema Hall 2", CinemaHallType.ThreeDimensional);
        CinemaHall hall3 = new CinemaHall("Cinema Hall 3", CinemaHallType.TwoDimensional);
        CinemaHall hall4 = new CinemaHall("Cinema Hall 4", CinemaHallType.TwoDimensional);
        CinemaHall hall5 = new CinemaHall("Cinema Hall 5", CinemaHallType.ThreeDimensional);
        CinemaHall hall6 = new CinemaHall("Cinema Hall 6", CinemaHallType.FourDimensional);
        CinemaHall hall7 = new CinemaHall("Cinema Hall 7", CinemaHallType.ThreeDimensional);
        CinemaHall hall8 = new CinemaHall("Cinema Hall 8", CinemaHallType.TwoDimensional);
        CinemaHall hall9 = new CinemaHall("Cinema Hall 9", CinemaHallType.FourDimensional);
        CinemaHall hall10 = new CinemaHall("Cinema Hall 10", CinemaHallType.TwoDimensional);
        List<CinemaHall> cinemaHallList = Arrays.asList(hall1, hall2, hall3, hall4, hall5, hall6, hall7, hall8, hall9, hall10);

        Map<CinemaHallType, Long> groupedCinemaHalls =
                cinemaHallList.stream().collect(Collectors.groupingBy(CinemaHall::getCinemaHallType, Collectors.counting()));
        System.out.println("\nGrouped cinema halls:" + groupedCinemaHalls);
    }
}

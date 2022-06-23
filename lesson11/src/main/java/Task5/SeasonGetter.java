package Task5;

import java.time.Month;

enum Seasons {
    Winter,
    Spring,
    Summer,
    Autumn
}

public class SeasonGetter {
    public static String getSeason(Month month) {

        switch (month) {
            case JANUARY:
            case FEBRUARY:
            case DECEMBER:
                return Seasons.Winter.name();
            case MARCH:
            case APRIL:
            case MAY:
                return Seasons.Spring.name();
            case JUNE:
            case JULY:
            case AUGUST:
                return Seasons.Summer.name();
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Seasons.Autumn.name();
        }
        return null;
    }
}

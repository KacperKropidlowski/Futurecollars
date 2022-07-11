package Task7;

public class WeekdaysToStringConverter {

    public String convertWeekdayToString(Weekdays weekdays) {
        return capitalize(weekdays.name().toLowerCase());
    }

    private String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}


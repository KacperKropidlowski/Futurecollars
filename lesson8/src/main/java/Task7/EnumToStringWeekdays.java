package Task7;

public class EnumToStringWeekdays {

    EnumWeekdays weekday;

    public EnumToStringWeekdays(EnumWeekdays weekday) {
        this.weekday = weekday;
    }

    public String enumToStringWeekdays() {
        return weekday.toString();
    }
}

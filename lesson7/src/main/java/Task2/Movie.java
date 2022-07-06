package Task2;

public class Movie {
    private final String title;
    private final String director;
    private final int duration;
    private final int productionYear;

    public Movie(String title, String director, int duration, int productionYear) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.productionYear = productionYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public int getProductionYear() {
        return productionYear;
    }
}

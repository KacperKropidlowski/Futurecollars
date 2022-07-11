package Task2;

import java.util.List;

public class Pizza {
    private final String name;
    List<Ingredient> composition;
    private final int calories;
    private final boolean isVegetarian;

    public Pizza(String name, List<Ingredient> composition, int calories, boolean isVegetarian) {
        this.name = name;
        this.composition = composition;
        this.calories = calories;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getComposition() {
        return composition;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}

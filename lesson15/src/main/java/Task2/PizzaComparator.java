package Task2;

import java.util.*;

public class PizzaComparator {
    public static void main(String[] args) {
        List<Ingredient> diavolaComposition = Arrays.asList(Ingredient.mozzarella, Ingredient.tomato, Ingredient.salami);
        Pizza diavola = new Pizza("Diavola", diavolaComposition, 1300, false);
        List<Ingredient> romaComposition = Arrays.asList(Ingredient.mozzarella, Ingredient.tomato, Ingredient.champignons, Ingredient.onion);
        Pizza roma = new Pizza("Roma", romaComposition, 1050, true);
        List<Ingredient> parmaComposition = Arrays.asList(Ingredient.mozzarella, Ingredient.tomato, Ingredient.champignons, Ingredient.salami);
        Pizza parma = new Pizza("Parma", parmaComposition, 1400, false);
        List<Ingredient> veronaComposition = Arrays.asList(Ingredient.mozzarella, Ingredient.tomato, Ingredient.salami, Ingredient.onion, Ingredient.celery);
        Pizza verona = new Pizza("Verona", veronaComposition, 1500, false);
        List<Ingredient> biancaComposition = Arrays.asList(Ingredient.mozzarella, Ingredient.celery, Ingredient.champignons, Ingredient.onion);
        Pizza bianca = new Pizza("Bianca", biancaComposition, 1100, true);
        List<Ingredient> funghiComposition = Arrays.asList(Ingredient.mozzarella, Ingredient.tomato, Ingredient.champignons);
        Pizza funghi = new Pizza("Funghi", funghiComposition, 1000, true);
        List<Ingredient> vegeterianaComposition = Arrays.asList(Ingredient.mozzarella, Ingredient.tomato, Ingredient.champignons, Ingredient.onion, Ingredient.celery, Ingredient.pepper);
        Pizza vegetariana = new Pizza("Vegetariana", vegeterianaComposition, 1150, true);
        List<Ingredient> margheritaCompsition = Arrays.asList(Ingredient.mozzarella, Ingredient.tomato);
        Pizza margherita = new Pizza("Margherita", margheritaCompsition, 850, true);
        List<Ingredient> diavolaExtraComposition = Arrays.asList(Ingredient.mozzarella, Ingredient.tomato, Ingredient.salami, Ingredient.onion, Ingredient.pepper);
        Pizza diavolaExtra = new Pizza("Diavola Extra", diavolaExtraComposition, 1350, false);
        List<Ingredient> marinaraComposition = List.of(Ingredient.tomato);
        Pizza marinara = new Pizza("Marinara", marinaraComposition, 700, true);

        List<Pizza> menu = Arrays.asList(marinara, diavolaExtra, margherita, vegetariana, funghi, bianca, verona, parma, roma, diavola);
        System.out.println("Vegetarian pizzas:");
        menu
                .stream()
                .filter(Pizza::isVegetarian)
                .forEach(pizza -> System.out.println(pizza.getName()));
        System.out.println("\nPizzas with celery:");
        menu
                .stream()
                .filter(pizza -> pizza.getComposition().contains(Ingredient.celery))
                .forEach(pizza -> System.out.println(pizza.getName()));
        System.out.println("\nVegetarian pizzas with tomato and pepper:");
        menu
                .stream()
                .filter(Pizza::isVegetarian)
                .filter(pizza -> pizza.getComposition().contains(Ingredient.tomato))
                .filter(pizza -> pizza.getComposition().contains(Ingredient.pepper))
                .forEach(pizza -> System.out.println(pizza.getName()));
        System.out.println("\nDoes all pizzas contains mozzarella:");
        System.out.println(menu
                .stream()
                .allMatch(pizza -> pizza.getComposition().contains(Ingredient.mozzarella)));
        System.out.println("\nPizza with the most amount of calories:");
        Pizza maxCalories = menu
                .stream()
                .max(Comparator.comparing(Pizza::getCalories))
                .get();
        System.out.println(maxCalories.getName());
        System.out.println("\nPizza with the least amount of calories");
        Pizza minCalories = menu
                .stream()
                .min(Comparator.comparing((Pizza::getCalories)))
                .get();
        System.out.println(minCalories.getName());
    }
}
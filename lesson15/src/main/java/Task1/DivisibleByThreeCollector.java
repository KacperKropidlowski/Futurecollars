package Task1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class DivisibleByThreeCollector {
    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    public void getDivisibleByThreeCollectionFromRange(int startOfRange, int endOfRange) {
        IntStream inputStream = IntStream.range(startOfRange - 1, endOfRange + 1);
        ArrayList<Integer> result = new ArrayList<>();
        inputStream
                .filter(this::isDivisibleByThree)
                .forEach(result::add);
        result
                .forEach(System.out::println);
    }
}

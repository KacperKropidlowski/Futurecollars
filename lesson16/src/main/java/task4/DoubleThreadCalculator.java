package task4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class DoubleThreadCalculator {

    public void doubleThreadCalculate(List<Integer> integers) {

        Thread firstThread = new Thread(() -> {
            int sum = integers
                    .stream()
                    .reduce(0, Integer::sum);
            System.out.println(Thread.currentThread().getName() + ": sum = " + sum);
        });

        Thread secondThread = new Thread(() -> {
            int[] integersArray = integers
                    .stream()
                    .mapToInt(i -> i)
                    .toArray();
            OptionalDouble average = Arrays
                    .stream(integersArray)
                    .average();
            if (average.isPresent()) {
                System.out.println(Thread.currentThread().getName() + ": average = " + average.getAsDouble());
            }
        });
        firstThread.start();
        secondThread.start();
    }
}

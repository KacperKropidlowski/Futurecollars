package Task2;

public class FizzBuzz {
    private boolean isDivisibleBy(int value, int divider){
        return value % divider == 0;
    }
    public void fizzBuzz() {
        for (int i = 1; i < 101; i++) {
            if (isDivisibleBy(i,3) && isDivisibleBy(i,5)) {
                System.out.println("FizzBuzz");
            } else if (isDivisibleBy(i,5)) {
                System.out.println("Buzz");
            } else if (isDivisibleBy(i,3)) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}

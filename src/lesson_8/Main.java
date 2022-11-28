package lesson_8;

public class Main {
    public static void main(String[] args) {

        Counter oddCounter = new Counter("Нечетные числа");
        Counter evenCounter = new Counter("Четные числа");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) evenCounter.increaseByOne();
            else oddCounter.increaseByOne();
        }

        consoleOutput(oddCounter.name, oddCounter.counter);
        consoleOutput(evenCounter.name, evenCounter.counter);

    }

    public static void consoleOutput(String name, int counter){
        System.out.printf("%s: %d \n", name, counter);
    }
}

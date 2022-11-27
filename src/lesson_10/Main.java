package lesson_10;

public class Main {


    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.counter++;
        counter2.counter++;

        System.out.println(counter1.counter + " " + counter2.counter);
    }
}

package lesson_10.task2;

public class Counter {

    String name;
    int counter;

    public Counter (String name, int counter) {
        this.name = name;
        this.counter = counter;
    }
    public Counter (String name){
        this(name, 0);
    }

    public int increaseByOne(){
        return counter++;
    }
    public int decreaseByOne(){
        return counter--;
    }
    public int increaseByUserValue(int step){
        return counter += step;
    }
    public int decreaseByUserValue(int step){
        return counter -= step;


    }
}

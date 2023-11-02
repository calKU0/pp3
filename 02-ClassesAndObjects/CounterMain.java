public class CounterMain {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.increaseByTen();
        c1.increaseByTen();
        c1.increaseByOne();
        c1.increaseByOne();
        c1.increaseByOne();
        c1.showValue();

        Counter c2 = new Counter();
        c2.decreaseByTen();
        c2.decreaseByTen();
        c2.decreaseByTen();
        c2.decreaseByTen();
        c2.decreaseByTen();
        c2.increaseByOne();
        c2.increaseByOne();
        c2.increaseByOne();
        c2.showValue();
    }
}

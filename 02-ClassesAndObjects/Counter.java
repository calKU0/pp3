public class Counter {
    int value = 0;

    public void increaseByOne()
    {
        value++;
    }

    public void decreaseByOne()
    {
        value--;
    }

    public void increaseByTen()
    {
        value = value + 10;
    }

    public void decreaseByTen()
    {
        value = value - 10;
    }

    public void reset()
    {
        value = 0;
    }

    public void showValue()
    {
        System.out.println("Value: " + value);
    }
}

public class BasicStats {
    static int numbersInRange(int x, int y)
    {
        return y-x;
    }

    static int sumInRange(int x, int y)
    {
        int sum = 0;

        for (int i = x; i<=y; i++)
        {
            sum = sum + i;
        }

        return sum;
    }

    static float arithmeticMeanInRange(int x, int y)
    {
        return sumInRange(x, y) / numbersInRange(x, y);
    }
}

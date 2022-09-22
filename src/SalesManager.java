
public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = 2147483647;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int average(int max, int min) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        sum -= max;
        sum -= min;
        sum /= sales.length - 2;
        return sum;
    }
}

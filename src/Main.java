
public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{100, 70, 110, 50});
        System.out.println("Максимальная продажа: " + salesManager.max());
        System.out.println("Минимальная продажа: " + salesManager.min());
        System.out.println("Обрезанное среднее: " + salesManager.average(salesManager.max(), salesManager.min()));
    }
}


public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{100, 70, 110, 50});
        System.out.println("Максимальная продажа: " + salesManager.max());
    }
}

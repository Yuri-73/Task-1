public class Main {
    public static void main(String[] args) {
        int c = 300_000;
        long dauCountInSec = 1000 * 24 * 3600L;
        long distance = c * dauCountInSec;

        System.out.println("Расстояние, которое пройдёт свет за 1000 дней - " + distance + " км");
    }
}

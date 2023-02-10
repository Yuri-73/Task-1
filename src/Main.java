public class Main {
    public static void main(String[] args) {
    task1();
    task2();
   }
    public static void task1() {
        int c = 300_000;
        long dauCountInSec = 1000 * 24 * 3600L;
        long distance = c * dauCountInSec;

        System.out.println("Расстояние, которое пройдёт свет за 1000 дней - " + distance + " км");
    }
    public static void task2() {
        int second = 1000_000;
        double minutes = second / 60D;
        double hour = minutes / 60D;
        double dau = hour / 24D;
        System.out.println("В 1000.000 сек - " + dau + " дней");
        System.out.println("               - " + hour + " часов");
        System.out.println("               - " + minutes + " минут");
    }
}

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

        int Dau = second / (60 * 24 * 60);
        int Hour = second % (60 * 24 * 60) / 3600;
        int Min = (second % (60 * 24 * 60) % 3600) / 60;
        int Sec = (second % (60 * 24 * 60) % 3600) % 60;;

        System.out.println("В 1000.000 сек " + Dau + " дней");
        System.out.println("               " + Hour + " часов");
        System.out.println("               " + Min + " минут");
        System.out.println("               " + Sec + " секунд");
    }
}

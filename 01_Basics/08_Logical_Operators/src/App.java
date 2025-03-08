public class App {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int x = 6;
        int y = 4;

        boolean r1 = a > b && x > y;
        System.out.println(r1); // false

        boolean r2 = a < b && x > y;
        System.out.println(r2); // true

        boolean r3 = a > b || x > y;
        System.out.println(r3); // true

        boolean r4 = a > b;
        System.out.println(r4); // false
        System.out.println(!r4); // true
    }
}

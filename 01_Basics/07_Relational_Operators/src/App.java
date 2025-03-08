public class App {
    public static void main(String[] args) {
        int x = 6;
        int y = 4;
        int z = 6;

        boolean result = x < y;
        System.out.println(result); // false

        System.out.println(x > y); // true
        System.out.println(x >= z); // true
        System.out.println(x <= z); // true
        System.out.println(x != z); // false
        System.out.println(x != y); // true
        System.out.println(x == z); // true
    }
}

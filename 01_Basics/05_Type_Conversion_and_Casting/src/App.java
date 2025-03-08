public class App {
    public static void main(String[] args) {
        byte b = 127; // max value of byte
        System.out.println(b); // 127

        // byte b = 257; // cannot convert from int to byte

        int a = b;
        System.out.println(a); // 127

        // Type casting
        int m = 10;
        // byte n = m; // cannot convert from int to byte
        byte n = (byte) m;
        System.out.println(n); // 10

        float x = 3.21f;
        // int y = x; // cannot convert from float to int
        int y = (int) x;
        System.out.println(y); // 3

        // Type promotion
        byte b1 = 10;
        byte b2 = 30;
        int result = b1 * b2;
        System.out.println(result); // 300
    }
}

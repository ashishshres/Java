public class App {
    public static void main(String[] args) {
        int binary = 0b101; // binary value
        System.out.println(binary); // 5

        int hex = 0x7E; // hexadecimal value
        System.out.println(hex); // 126

        int amount = 10_00_000;
        System.out.println(amount); // 1000000

        double d = 10;
        System.out.println(d); // 10.0

        double exp = 12e10; // 12 x (10 ^ 10) = 120,000,000,000
        System.out.println(exp); // 1.2E11 = 120,000,000,000

        // boolean b = 1; // cannot convert from int to boolean

        char c1 = 'A';
        System.out.println(c1); // A

        char c2 = 'a';
        c2++;
        System.out.println(c2); // b
    }
}

public class App {
    public static void main(String[] args) {
        int num = 4;
        int result = 0;

        // if (num % 2 == 0) {
        // result = 10;
        // } else {
        // result = 20;
        // }
        // System.out.println(result); // 10

        result = (num % 2 == 0) ? 10 : 20;
        System.out.println(result); // 10
    }
}

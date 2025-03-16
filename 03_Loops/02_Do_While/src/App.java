public class App {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Start of do while loop");
        do {
            System.out.println("Hi " + i);
            /*
             * Hi 1
             * Hi 2
             * Hi 3
             * Hi 4
             * Hi 5
             * Hi 6
             * Hi 7
             * Hi 8
             * Hi 9
             * Hi 10
             */
            i++;
        } while (i <= 10);
        System.out.println("End of do while loop");

        // Will run at least once neglecting the condition
        System.out.println("Start of do while loop");
        do {
            System.out.println("Hi"); // Hi
        } while (false);
        System.out.println("End of do while loop");
    }
}

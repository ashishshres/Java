public class App {
    public static void main(String[] args) {
        System.out.println("Start of for loop");
        for (int i = 1; i <= 10; i++) {
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
        }
        System.out.println("End of for loop");

        System.out.println("Start of outer for loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Outer " + i);
            System.out.println("Start of inner for loop");
            for (int j = 1; j <= 10; j++) {
                System.out.println("Inner " + i);
            }
            System.out.println("End of inner for loop");
        }
        System.out.println("End of outer for loop");
    }
}

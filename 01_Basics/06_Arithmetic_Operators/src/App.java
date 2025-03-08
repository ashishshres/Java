public class App {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;

        System.out.println(num1 + num2); // 6
        System.out.println(num1 - num2); // 2
        System.out.println(num1 * num2); // 8
        System.out.println(num1 / num2); // 2
        System.out.println(num1 % num2); // 0

        // Shorthand operators
        int count = 10;
        // count = count + 2;
        count += 2;
        System.out.println(count); // 12

        count -= 2; // 12 - 2
        System.out.println(count); // 10

        count *= 2; // 10 * 2
        System.out.println(count); // 20

        count /= 2; // 20 / 2
        System.out.println(count); // 10

        // Increment operator
        int increment = 1;
        // increment = increment + 1;
        // increment += 1;
        increment++;
        // ++increment;
        System.out.println(increment); // 2

        // Decrement operator
        int decrement = 1;
        // decrement = decrement - 1;
        // decrement -= 1;
        decrement--;
        // --decrement;
        System.out.println(decrement); // 0

        /*
         * Post increment and Pre increment behaves differently when assigning to a
         * value
         */

        int x = 10;
        int resultPost = x++;
        System.out.println(resultPost); // 10

        int y = 10;
        int resultPre = ++y;
        System.out.println(resultPre); // 11
    }
}

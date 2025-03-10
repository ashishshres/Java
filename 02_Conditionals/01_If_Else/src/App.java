public class App {
    public static void main(String[] args) {

        // if
        // if (true) {
        // System.out.println("True");
        // }

        // if-else
        int age = 20;
        if (age > 18) {
            System.out.println("Valid age"); // Valid age
        } else {
            System.out.println("Invalid age");
        }

        char gender = 'F';
        if (gender == 'M') {
            System.out.println("Male");
        } else {
            System.out.println("Female"); // Female
        }

        int value = 24;
        if (value > 20 && value < 30) {
            System.out.println("Value between 20-30"); // Value between 20-30
        } else {
            System.out.println("Value out of range 20-30");
        }

        // if-elseif
        int num = -3;
        if (num > 0) {
            System.out.println("Number is +ve");
        } else if (num < 0) {
            System.out.println("Number is -ve"); // Number is -ve
        } else {
            System.out.println("Number is equal to zero");
        }
    }
}

class Calculator {
    // Properties
    int a;

    // Methods
    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}

public class App {
    public static void main(String[] args) {
        // Making object of class Calculator
        Calculator calc1 = new Calculator();
        int result1 = calc1.add(10, 20);
        System.out.println(result1); // 30

        int num1 = 2;
        int num2 = 4;
        Calculator calc2 = new Calculator();
        int result2 = calc2.add(num1, num2);
        System.out.println(result2); // 6
    }
}

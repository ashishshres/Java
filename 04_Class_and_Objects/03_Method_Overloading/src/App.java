class Calculator {
    // add method with two parameters
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // add method with three parameters
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

public class App {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        int result1 = calc1.add(2, 4);
        System.out.println(result1); // 6

        Calculator calc2 = new Calculator();
        int result2 = calc2.add(10, 20, 30);
        System.out.println(result2); // 60
    }
}

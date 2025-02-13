// Create a program that takes two numbers and shows result of all arithmetic operators (+ - * / %).

import java.util.Scanner;

public class Challenge2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int first = input.nextInt();
    System.out.print("Enter second number: ");
    int second = input.nextInt();

    int add = first + second;
    int sub = first - second;
    int mul = first * second;
    int div = first / second;
    int mod = first % second;

    System.out.printf("%d + %d: %d\n", first, second, add);
    System.out.printf("%d - %d: %d\n", first, second, sub);
    System.out.printf("%d * %d: %d\n", first, second, mul);
    System.out.printf("%d / %d: %d\n", first, second, div);
    System.out.printf("%d %% %d: %d\n", first, second, mod);

    input.close();
  }
}

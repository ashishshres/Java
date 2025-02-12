// Create a program to add two numbers.

import java.util.Scanner;

public class Challenge3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int firstNumber = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNumber = input.nextInt();
    int sum = firstNumber + secondNumber;
    System.out.println("Sum is " + sum);
    input.close();
  }
}

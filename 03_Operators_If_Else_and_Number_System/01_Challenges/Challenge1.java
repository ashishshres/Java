// Create a program to swap two numbers.

import java.util.Scanner;

public class Challenge1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int first = input.nextInt();
    System.out.print("Enter second number: ");
    int second = input.nextInt();
    int temp;

    System.out.println("Before:");
    System.out.println("first: " + first);
    System.out.println("second: " + second);

    // swapping logic
    temp = first;
    first = second;
    second = temp;
    System.out.println("***************");
    System.out.println("After:");
    System.out.println("first: " + first);
    System.out.println("second: " + second);

    input.close();
  }
}

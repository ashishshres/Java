// Write a function that calculates the factorial of a given number.

import java.util.Scanner;

public class Challenge3 {
  public static int factorial(int num) {
    int factorial = 1;
    int i = 1;
    while (i <= num) {
      factorial = factorial * i;
      i++;
    }
    return factorial;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number for factorial: ");
    int num = input.nextInt();
    System.out.printf("Factorial of %d is %d", num, factorial(num));
    input.close();
  }
}

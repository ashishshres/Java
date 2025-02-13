// Create a program that determines the greatest of the three numbers.

import java.util.Scanner;

public class Challenge6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int firstNum = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNum = input.nextInt();
    System.out.print("Enter third number: ");
    int thirdNum = input.nextInt();

    if (firstNum >= secondNum && firstNum >= thirdNum) {
      System.out.printf("%d is greatest.", firstNum);
    } else if (secondNum >= firstNum && secondNum >= thirdNum) {
      System.out.printf("%d is greatest.", secondNum);
    } else {
      System.out.printf("%d is greatest.", thirdNum);
    }

    input.close();
  }
}

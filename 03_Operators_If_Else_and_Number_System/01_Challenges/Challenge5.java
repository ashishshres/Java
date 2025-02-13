// Create a program that determines if a number is positive, negative or zero.

import java.util.Scanner;

public class Challenge5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();

    if (num > 0) {
      System.out.printf("%d is positive.", num);
    } else if (num < 0) {
      System.out.printf("%d is negative.", num);
    } else {
      System.out.printf("Number is zero.", num);
    }

    input.close();
  }
}

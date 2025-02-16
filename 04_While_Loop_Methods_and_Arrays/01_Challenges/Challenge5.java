// Create a program to find the Highest Common Factor (HCF) of two numbers.

import java.util.Scanner;

public class Challenge5 {
  public static int hcf(int first, int second) {
    int hcf = 0;
    if (first < second) {
      hcf = first;
    } else {
      hcf = second;
    }

    while (hcf >= 1) {
      if (first % hcf == 0 && second % hcf == 0) {
        break;
      }
      hcf--;
    }

    return hcf;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int first = input.nextInt();
    System.out.print("Enter the second number: ");
    int second = input.nextInt();
    System.out.printf("HCF of %d and %d: %d", first, second, hcf(first, second));
    input.close();
  }
}

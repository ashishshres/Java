// Create a program to check whether a number is prime or not.

import java.util.Scanner;

public class Challenge6 {
  public static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }

    int i = 2;
    while (i < num) {
      if (num % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number to check for prime: ");
    int number = input.nextInt();
    if (isPrime(number)) {
      System.out.println("The number is prime!");
    } else {
      System.out.println("The number is not prime!");
    }
    input.close();
  }
}

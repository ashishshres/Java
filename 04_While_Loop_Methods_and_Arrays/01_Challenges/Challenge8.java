// Create a program to print the fibonacci series upto a certain number.

import java.util.Scanner;

public class Challenge8 {
  public static void printFibo(int range) {
    int first = -1;
    int second = 1;
    int next = 0;
    int count = 1;
    while (count <= range) {
      next = first + second;
      System.out.printf("%d\t", next);
      first = second;
      second = next;
      count++;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int number = input.nextInt();
    printFibo(number);
    input.close();
  }
}

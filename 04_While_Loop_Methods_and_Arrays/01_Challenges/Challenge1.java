// Develop a program that prints the multiplication table for a given number.

import java.util.Scanner;

public class Challenge1 {
  public static void printMultiplication(int num) {
    int i = 1;
    while (i <= 10) {
      int multiplication = num * i;
      System.out.printf("%d x %d = %d\n", num, i, multiplication);
      i++;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number for multiplication table: ");
    int num = input.nextInt();
    printMultiplication(num);
    input.close();
  }
}

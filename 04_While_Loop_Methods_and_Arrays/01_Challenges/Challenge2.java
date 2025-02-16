// Create a program to sum all odd numbers from 1 to specified number N.

import java.util.Scanner;

public class Challenge2 {
  public static int sumOdd(int range) {
    int sum = 0;
    int i = 1;
    while (i <= range) {
      if (i % 2 != 0) {
        sum += i;
      }
      i++;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the range for odd calculation: ");
    int num = input.nextInt();
    int sum = sumOdd(num);
    System.out.printf("Sum upto %d: %d", num, sum);
    input.close();
  }
}

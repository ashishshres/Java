// Create a program to find the Least Common Multiple (LCM) of two numbers.

import java.util.Scanner;

public class Challenge4 {
  public static int lcm(int first, int second) {
    int lcm = 0;
    if (first > second) {
      lcm = first;
    } else {
      lcm = second;
    }

    int range = first * second;
    while (lcm <= range) {
      if (lcm % first == 0 && lcm % second == 0) {
        break;
      }
      if (first > second) {
        lcm += first;
      } else {
        lcm += second;
      }
    }
    return lcm;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int first = input.nextInt();
    System.out.print("Enter the second number: ");
    int second = input.nextInt();
    System.out.printf("LCM of %d and %d: %d", first, second, lcm(first, second));
    input.close();
  }
}

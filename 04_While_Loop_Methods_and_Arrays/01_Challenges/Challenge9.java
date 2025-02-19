// Create a program to check if a number is palindrome or not.

import java.util.Scanner;

public class Challenge9 {
  public static boolean isPalindrome(int num) {
    int reversed = 0;
    int original = num;
    while (num > 0) {
      reversed = (num % 10) + (reversed * 10);
      num = num / 10;
    }
    if (original == reversed) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number to reverse: ");
    int number = input.nextInt();
    if (isPalindrome(number)) {
      System.out.printf("%d is palindrome.", number);
    } else {
      System.out.printf("%d is not palindrome.", number);
    }
    input.close();
  }
}

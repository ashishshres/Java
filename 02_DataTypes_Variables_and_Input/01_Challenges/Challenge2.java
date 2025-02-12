// Create a program to input name of the person and respond with "Welcome NAME from Java".

import java.util.Scanner;

public class Challenge2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.print("Welcome " + name + " from Java.");
    input.close();
  }
}

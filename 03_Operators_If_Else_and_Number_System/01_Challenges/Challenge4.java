// Create a program to convert Fahrenheit to Celcius.

import java.util.Scanner;

public class Challenge4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your temperature in F: ");
    float fah = input.nextFloat();
    float cel = (fah - 32) * 5.0f / 9.0f;
    System.out.printf("Your temperature is %f Celcius", cel);
    input.close();
  }
}

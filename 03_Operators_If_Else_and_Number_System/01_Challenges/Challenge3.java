// Create a program to calculate the area of triangle ((1/2) * b * h).

import java.util.Scanner;

public class Challenge3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the base: ");
    float base = input.nextFloat();
    System.out.print("Enter the height: ");
    float height = input.nextFloat();

    float areaTriangle = 0.5f * base * height;
    System.out.printf("The area of triangle is %.2f", areaTriangle);

    input.close();
  }
}

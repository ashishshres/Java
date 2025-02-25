// Create a program to find number of occurences of an element in an array.

import java.util.Scanner;

public class Challenge11 {
  public static int[] inputArray() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int size = input.nextInt();
    int[] nums = new int[size];
    int i = 0;
    while (i < size) {
      System.out.print("Enter the element: ");
      nums[i] = input.nextInt();
      i++;
    }
    return nums;
  }

  public static int noOfOccurences(int[] arr, int find) {
    int occurences = 0;
    int i = 0;
    while (i < arr.length) {
      if (arr[i] == find) {
        occurences++;
      }
      i++;
    }
    return occurences;
  }

  public static void main(String[] args) {
    int[] myArr = inputArray();
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number you want to find: ");
    int find = input.nextInt();
    int occurences = noOfOccurences(myArr, find);
    System.out.printf("Your element was found %d times.", occurences);
    input.close();
  }
}

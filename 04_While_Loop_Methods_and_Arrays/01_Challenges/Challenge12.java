// Create a program to find maximum and minimum element in an array.

import java.util.Scanner;

public class Challenge12 {
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
    input.close();
    return nums;
  }

  public static int min(int[] arr) {
    int i = 0;
    int min = arr[i];
    while (i < arr.length) {
      if (arr[i] < min) {
        min = arr[i];
      }
      i++;
    }
    return min;
  }

  public static int max(int[] arr) {
    int i = 0;
    int max = arr[i];
    while (i < arr.length) {
      if (arr[i] > max) {
        max = arr[i];
      }
      i++;
    }
    return max;
  }

  public static void main(String[] args) {
    int[] myArr = inputArray();
    int maxElem = max(myArr);
    int minElem = min(myArr);
    System.out.printf("The maximum element in array is %d\n", maxElem);
    System.out.printf("The minimum element in array is %d\n", minElem);
  }
}

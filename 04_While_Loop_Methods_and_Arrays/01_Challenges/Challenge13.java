// Create a program to check if the given array is sorted.

import java.util.Scanner;

public class Challenge13 {
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

  public static void isSorted(int[] arr) {
    int i = 1, j = 1;
    int flag = 0;
    while (i < arr.length) {
      if (arr[i] > arr[i - 1]) {
        flag = 0;
      } else {
        flag = 1;
        break;
      }
      i++;
    }

    while (j < arr.length) {
      if (arr[j] < arr[j - 1]) {
        flag = 0;
      } else {
        flag = 1;
        break;
      }
      i++;
    }
    if (flag == 1) {
      System.out.println("Array is not sorted.");
    } else {
      System.out.println("Array is sorted.");
    }
  }

  public static void main(String[] args) {
    int[] myArr = inputArray();
    isSorted(myArr);
  }
}

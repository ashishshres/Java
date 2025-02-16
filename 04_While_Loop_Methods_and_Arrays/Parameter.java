public class Parameter {
  public static int sumTwoNumbers(int first, int second) {
    int sum = first + second;
    return sum;
  }

  public static void main(String[] args) {
    int sum = sumTwoNumbers(10, 20);
    System.out.println("Sum: " + sum); // 30
    System.out.println(sumTwoNumbers(1, 2)); // 3
  }
}

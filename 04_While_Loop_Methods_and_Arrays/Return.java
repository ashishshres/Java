import java.util.Scanner;

public class Return {
  public static int readNumber() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = input.nextInt();
    return number;
  }

  public static void main(String[] args) {
    int firstNumber = readNumber(); // 10
    int secondNumber = readNumber(); // 20
    int sum = firstNumber + secondNumber;
    System.out.printf("%d + %d: %d\n", firstNumber, secondNumber, sum); // 30
  }
}

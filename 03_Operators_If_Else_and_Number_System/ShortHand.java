import java.util.Scanner;

public class ShortHand {
  public static void main(String[] args) {
    int a = 5;
    Scanner input = new Scanner(System.in);

    int x1 = input.nextInt();
    // a = a + x1;
    a += x1;
    System.out.println("a: " + a);

    int x2 = input.nextInt();
    // a = a + x2;
    a += x2;
    System.out.println("a: " + a);

    int x3 = input.nextInt();
    // a = a + x3;
    a += x3;
    System.out.println("a: " + a);

    int x4 = input.nextInt();
    // a = a + x4;
    a += x4;
    System.out.println("a: " + a);

    input.close();
  }
}

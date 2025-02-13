public class UnaryOp {
  public static void main(String[] args) {
    int x = 5;
    int y = -x;
    System.out.println("y: " + y); // -5

    int a = 5;
    a = a + 1;
    System.out.println("a: " + a); // 6
    a += 1;
    System.out.println("a: " + a); // 7
    a++;
    System.out.println("a: " + a); // 8
    a--;
    System.out.println("a: " + a); // 7

    int b = 2;
    System.out.println("b++: " + b++); // 2
    System.out.println("b++: " + b++); // 3
    System.out.println("++b: " + ++b); // 5
    System.out.println("++b: " + ++b); // 6
    System.out.println("--b: " + --b); // 5
    System.out.println("b--: " + b--); // 5
    System.out.println("b: " + b); // 6
  }
}

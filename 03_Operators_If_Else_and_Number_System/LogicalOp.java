public class LogicalOp {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 10;

    System.out.println(a > b && a > c); // false
    System.out.println(a > b && a < c); // false
    System.out.println(a < b && a < c); // false
    System.out.println(a < b && a > c); // false
    System.out.println(a >= b && a >= c); // false
    System.out.println(a <= b && a >= c); // true
    System.out.println(a >= b && a <= c); // false
    System.out.println(a == b && a == c); // false
    System.out.println(a != b && a == c); // true
    System.out.println(a == b && a != c); // false
    System.out.println(a != b && a != c); // false

    System.out.println("----------------");

    System.out.println(a > b || a > c); // false
    System.out.println(a > b || a < c); // false
    System.out.println(a < b || a < c); // true
    System.out.println(a < b || a > c); // true
    System.out.println(a >= b || a >= c); // true
    System.out.println(a <= b || a >= c); // true
    System.out.println(a >= b || a <= c); // true
    System.out.println(a == b || a == c); // true
    System.out.println(a != b || a == c); // true
    System.out.println(a == b || a != c); // false
    System.out.println(a != b || a != c); // true

    System.out.println("----------------");

    System.out.println(!true); // false
    System.out.println(!false); // true
  }
}

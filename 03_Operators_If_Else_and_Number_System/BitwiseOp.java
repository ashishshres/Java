public class BitwiseOp {
  public static void main(String[] args) {
    int a = 12; // 1100
    int b = 5; // 0101

    System.out.println(a & b); // 0100 // 4
    System.out.println(a | b); // 1101 // 13
    System.out.println(a ^ b); // 1001 // 9
    System.out.println(a << 1); // 11000 // 24
    System.out.println(b << 1); // 01010 // 10
    System.out.println(a >> 1); // 0110 // 6
    System.out.println(b >> 1); // 0010 // 2
  }
}

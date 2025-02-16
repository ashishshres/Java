public class WhileLoop {
  public static void main(String[] args) {
    int num = 1;
    while (num <= 10) {
      System.out.println(num);
      /*
       * 1
       * 2
       * 3
       * 4
       * 5
       * 6
       * 7
       * 8
       * 9
       * 10
       */
      num++;
    }

    int nextNum = 10;
    while (nextNum > 0) {
      System.out.println(nextNum);
      /*
       * 10
       * 9
       * 8
       * 7
       * 6
       * 5
       * 4
       * 3
       * 2
       * 1
       */
      nextNum--;
    }
  }
}
public class Method {
  public static void greeting() {
    System.out.println("Good Morning!");
  }

  public static void printFirstPattern() {
    int rows = 0;
    while (rows < 5) {
      System.out.print("*");

      int i = 0;
      while (i < rows) {
        System.out.print("*");
        i++;
      }

      System.out.println();
      rows++;

      /*
        *
        **
        ***
        ****
        *****
      */
    }
  }

  public static void main(String[] args) {
    // System.out.println("Good Morning!");
    System.out.println("In main method");
    greeting(); // Good Morning!
    System.out.println("Method calling completed");

    printFirstPattern();
  }
}

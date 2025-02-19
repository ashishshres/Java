public class Array {
  public static void main(String[] args) {
    int[] myArr = { 3, 9, 60, 21, 12 };
    int index = 0;
    while (index < myArr.length) {
      System.out.println(myArr[index]);
      /*
       * 3
       * 9
       * 60
       * 21
       * 12
       */
      index++;
    }

    String[] strArr = { "Aryan", "Bishal", "Shikshya" };
    System.out.println(strArr.length); // 3
    index = 0;
    while (index < strArr.length) {
      System.out.println(strArr[index]);
      /*
       * Aryan
       * Bishal
       * Shikshya
       */
      index++;
    }

    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
    System.out.println(arr[0].length); // 3

    int[][] newArr = new int[2][2];
    newArr[0][0] = 1;
    newArr[0][1] = 2;
    newArr[1][0] = 3;
    newArr[1][1] = 4;
    int i = 0, j = 0;
    while (i < newArr.length) {
      j = 0;
      while (j < newArr[i].length) {
        System.out.println(newArr[i][j]);
        /*
         * 1
         * 2
         * 3
         * 4
         */
        j++;
      }
      i++;
    }
  }
}

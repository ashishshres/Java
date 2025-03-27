public class App {
    public static void main(String[] args) {
        int[][] nums = new int[2][2];
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[1][0] = 30;
        nums[1][1] = 40;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(nums[i][j] + " ");
            }
            /*
             * 10 20
             * 30 40
             */
            System.out.println();
        }
    }
}

public class App {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 0 };
        System.out.println(nums[0]); // 3
        System.out.println(nums[1]); // 2
        System.out.println(nums[2]); // 1
        System.out.println(nums[3]); // 0

        int[] newArr = new int[4];
        newArr[0] = 10;
        newArr[1] = 20;
        newArr[2] = 30;
        newArr[3] = 40;
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
            /*
             * 10
             * 20
             * 30
             * 40
             */
        }
    }
}

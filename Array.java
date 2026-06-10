public class Array {
    int[] nums = {10, 20, 30};

    public void printArray() {
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
    }

    //  lengthは配列のフィールド（メンバ変数）なのでメソッドではない点に注意
    public void printLength() {
        System.out.println(nums.length);
    }

    public void printArrayLoop() {
        for (int i = 0; i < nums.length; i ++) {
            System.out.println(nums[i]);
        }
        for (int num: nums) {
            System.out.println(num);
        }
    }
}
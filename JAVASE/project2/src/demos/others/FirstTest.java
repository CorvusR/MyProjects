package demos.others;

class FirstTest {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2, 4};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[0] = nums[0] ^ nums[i];
        }
        return nums[0];
    }
}

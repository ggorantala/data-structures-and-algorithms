package dp;

public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{1}));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int cMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            cMax = Math.max(nums[i], cMax + nums[i]);
            max = Math.max(cMax, max);
        }

        return max;
    }
}

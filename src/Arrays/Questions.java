package Arrays;

// https://leetcode.com/problems/missing-number/
public class Questions {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int i = 0;

            while (i < nums.length) {
                int correct = nums[i];

                if (correct < nums.length && nums[i] != nums[correct]) {
                    // swap
                    swap(nums, i, nums[i]);
                } else {
                    i++;
                }
            }

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j) {
                    return j;
                }
            }

        return nums.length;
    }

    static void swap(int[] nums, int first, int second) {
        // swap
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

package Arrays.Questions;

import java.util.Arrays;

// https://leetcode.com/problems/first-missing-positive/submissions/1023554605/ (Amazon)
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(firstMissingPositive(nums));
        System.out.println(Arrays.toString(nums));
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;

        while(i < nums.length) {
            int correctIdx = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIdx])
                // swap
                swap(nums, i, correctIdx);
            else
                i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1)
                return j+1;
        }

        return nums.length + 1;
    }

    static void swap(int[] nums, int first, int second) {
        // swap
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

package Arrays.Questions;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/description/
public class FindErrorNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIdx = nums[i] - 1;

            if (nums[i] != nums[correctIdx])
                // swap
                swap(nums, i, correctIdx);
            else
                i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return new int[] {nums[j], j + 1};
            }
        }

        return new int[]{};
    }

    static void swap(int[] nums, int first, int second) {
        // swap
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

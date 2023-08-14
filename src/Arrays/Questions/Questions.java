package Arrays.Questions;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/missing-number/ (Amazon)
public class Questions {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList<Integer> missingNumbers = findDisappearedNumbers(nums);
        System.out.println(missingNumbers);
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

    //  https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/ (Done with Cyclic Sort)
    // Google Question
    static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (i + 1 != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j]) {
                ans.add(j + 1);
            }
        }

        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        // swap
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

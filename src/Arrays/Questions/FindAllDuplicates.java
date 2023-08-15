package Arrays.Questions;

import java.util.*;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/ (microsoft, google)
public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> l = new ArrayList<>();

        while(i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                // swap
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                l.add(nums[j]);
        }
        return l;
    }

    static void swap(int[] nums, int first, int second) {
        // swap
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

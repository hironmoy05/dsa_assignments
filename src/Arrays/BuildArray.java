package Arrays;

import java.util.*;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {5, 0, 1, 2, 3, 4};

        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}

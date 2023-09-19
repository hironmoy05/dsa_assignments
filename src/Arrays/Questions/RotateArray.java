package Arrays.Questions;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/description/

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        k = k % nums.length;
        System.out.println(k);
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    // The time complexity of this is O(n2)
//    static void rotateArray(int[] nums, int k) {
//        int i = 1;
//
//        while (i <= k) {
//            int lastDigit = nums[nums.length - 1];
//
//            for (int j = nums.length - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//
//            nums[0] = lastDigit;
//
//            i++;
//        }
//    }
}

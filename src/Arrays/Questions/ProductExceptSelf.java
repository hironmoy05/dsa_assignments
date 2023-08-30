package Arrays.Questions;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(Arrays.toString(productExceptSelfByBrute(nums)));
    }

    static int[] productExceptSelfByBrute(int[] nums) {
        int[] leftPrefix = new int[nums.length];
        int[] rightPrefix = new int[nums.length];
        int[] result = new int[nums.length];

        leftPrefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftPrefix[i] = leftPrefix[i - 1] * nums[i-1];
        }

        rightPrefix[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0 ; i--) {
            rightPrefix[i] = rightPrefix[i + 1] * nums[i];
        }

        result[nums.length - 1] = leftPrefix[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            result[i-1] = leftPrefix[i-1] * rightPrefix[i];
        }

        return result;
    }

    static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        int leftProduct = 1;
        for (int i = 0; i < len; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        System.out.println(leftProduct + Arrays.toString(result));

        int rightProduct = 1;
        for (int i = len - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}

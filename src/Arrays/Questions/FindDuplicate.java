package Arrays.Questions;

// https://leetcode.com/problems/find-the-duplicate-number/submissions/
public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};

        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {

            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;

                if (nums[i] != nums[correct]) {
                    // swap
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] nums, int first, int second) {
        // swap
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

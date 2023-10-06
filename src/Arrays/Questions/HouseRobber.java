package Arrays.Questions;

// https://leetcode.com/problems/house-robber/
public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }

    static int rob(int[] nums) {
        // If only one element, just return it
        if (nums.length < 2) {
            return nums[0];
        }

        // create an array to store the maximum loot at each index
//        int[] maxLootsAtEachIndex = new int[nums.length];

        // maximize loots at first 2 index
//        maxLootsAtEachIndex[0] = nums[0];
//        maxLootsAtEachIndex[1] = Math.max(nums[0], nums[1]);
        int maxLoot = Math.max(nums[0], nums[1]);

        // use this to fill the array
        for (int i = 2; i < nums.length; i++) {
//            maxLootsAtEachIndex[i] = Math.max(maxLootsAtEachIndex[i - 2] + nums[i], maxLootsAtEachIndex[i - 1]);
            maxLoot = Math.max(nums[i - 2] + nums[i], maxLoot);
        }

//        return maxLootsAtEachIndex[nums.length - 1];
        return maxLoot;
    }
}
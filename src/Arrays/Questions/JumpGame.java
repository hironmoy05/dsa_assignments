package Arrays.Questions;

// https://leetcode.com/problems/jump-game/description/
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 2, 1, 0, 0, 1, 3};
        System.out.println(canJump(nums));
    }

    static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (reachable < i)
                return false;

            reachable = Math.max(reachable, i + nums[i]);
        }

        return true;
    }
}

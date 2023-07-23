package Arrays;

//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class MinCostToMoveChips {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 3, 3};

        System.out.println(minCostToMoveChips(nums));
    }

    static int minCostToMoveChips(int[] nums) {
        int even = 0;
        int odd = 0;

        for (int i : nums) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }

        return Math.min(even, odd);
    }
}

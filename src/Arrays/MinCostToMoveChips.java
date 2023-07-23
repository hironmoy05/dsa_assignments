package Arrays;

//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

/* We're using the concept of parity to group the chips. */

// let's imagine we have some colorful chips, and each chip has a number written on it. We also have two special groups to put these chips into, let's call them "Even Group" and "Odd Group."
// Now, we are going to look at each chip one by one and follow a rule to decide where to put them. The rule is about the number on each chip. If the number is an even number (like 2, 4, 6, and so on), we will put that chip into the "Even Group." And if the number is an odd number (like 1, 3, 5, and so on), we will put that chip into the "Odd Group."
// We keep doing this for all the chips, sorting them into their correct groups based on whether their numbers are even or odd.
// Now, we have these two groups with chips in them. Here comes the exciting part! We can move all the chips in each group to the same position without any cost. It's like a magical teleportation!
// But wait, there's more! If one of the groups has fewer chips than the other group, we can move the entire smaller group to the position where the bigger group is without any cost. It's super easy and quick because the chips can move in pairs!
// Finally, we just need to look at both groups and see which one is smaller. Once we find the smaller group, we can move them all to the same position as the bigger group. This way, we make sure all the chips end up together, and they can have a big party!
// So, by using this magic grouping and moving trick, we can figure out the minimum cost needed to get all the chips to the same position. It's like a fun game of sorting and teleporting chips to make them happy and party together! 🎉



/* The thought process behind this solution is based on a clever observation related to the cost of moving chips. Let's break down the thought process step by step: */

// 1. We are given an array position containing the positions of n chips.
// 2. The goal is to move all the chips to the same position using the minimum cost.
// 3. Each chip can be moved either 2 steps left or 2 steps right with no cost (cost = 0), or it can be moved 1 step left or 1 step right with a cost of 1.
// 4. The idea is to realize that moving chips 2 steps left or 2 steps right doesn't change the parity of their positions. If a chip is at an even position, moving it 2 steps left or 2 steps right will still leave it at an even position, and the same applies to chips at odd positions.
// 5. So, the optimal strategy is to group all the chips with even positions together and all the chips with odd positions together. Then, we can just move the entire group of chips with even positions to any even position (which has no cost), and similarly for the group of chips with odd positions.
// 6. The cost will be determined by the size of the smaller group (either the even group or the odd group) because we can always move the smaller group to the position of the larger group with a cost of 1 for each chip.
// 7. The solution iterates through the position array and counts the number of chips with even positions and odd positions.
// 8. The even variable keeps track of the count of chips with even positions, and the odd variable keeps track of the count of chips with odd positions.
// 9. Finally, the solution returns the minimum of even and odd, which represents the minimum cost needed to move all the chips to the same position.
// 10. In summary, the solution utilizes the concept of parity to group the chips and finds the smaller group (even or odd) to determine the minimum cost required to move all chips to the same position. It's a simple and efficient approach that doesn't involve actually moving the chips but rather focuses on counting and comparing the number of chips at even and odd positions.

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

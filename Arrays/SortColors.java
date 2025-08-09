/**
 * Problem: Sort Colors (LeetCode)
 * Difficulty: Medium
 * 
 * Approach:
 * - First pass: Move all 0's to the beginning.
 * - Second pass: Move all 1's next.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void sortColors(int[] nums) {
        int searcher, holder;
        searcher = holder = 0;

        // First pass: Move 0's to the front
        for (searcher = 0; searcher < nums.length; searcher++) {
            if (nums[searcher] == 0) {
                int temp = nums[holder];
                nums[holder] = nums[searcher];
                nums[searcher] = temp;
                holder++;
            }
        }

        // Second pass: Move 1's after 0's
        for (searcher = holder; searcher < nums.length; searcher++) {
            if (nums[searcher] == 1) {
                int temp = nums[holder];
                nums[holder] = nums[searcher];
                nums[searcher] = temp;
                holder++;
            }
        }
    }
}

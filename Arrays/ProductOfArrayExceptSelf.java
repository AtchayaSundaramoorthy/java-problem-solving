/**
 * Problem: Product of Array Except Self (LeetCode)
 * Difficulty: Medium
 * 
 * Approach:
 * - Use two passes with prefix and postfix multiplications.
 * - First pass calculates prefix products for each element.
 * - Second pass multiplies with postfix products.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1) (excluding output array)
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre = 1;
        int post = 1;
        int[] res = new int[n];

        // Initialize result array with 1
        for (int i = 0; i < n; i++) {
            res[i] = 1;
        }

        // Prefix pass
        for (int i = 0; i < n; i++) {
            res[i] *= pre;
            pre *= nums[i];
        }

        // Postfix pass
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= post;
            post *= nums[i];
        }

        return res;
    }
}

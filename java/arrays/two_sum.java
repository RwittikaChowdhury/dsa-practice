// Problem: Two Sum
// Platform: LeetCode
// Link: https://leetcode.com/problems/two-sum/submissions/1973426381
// Pattern: Hashing
// Time Complexity: O(n) [Optimal], O(n^2) [Brute Force]
// Space Complexity: O(n)
// Status: Solved in Java (2023), Added to GitHub (2026)

import java.util.HashMap;

class Solution {

    // 🔹 Approach 1: Brute Force (O(n^2))
    public int[] twoSumBruteForce(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // 🔹 Approach 2: Optimal (HashMap - O(n))
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}

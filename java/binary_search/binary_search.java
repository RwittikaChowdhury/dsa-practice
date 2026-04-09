// Problem: Binary Search
// Platform: LeetCode
// Link: https://leetcode.com/problems/binary-search/submissions/993326818/
// Pattern: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Status: Solved in Java (2023), Added to GitHub (2026)

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // Prevents overflow
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}

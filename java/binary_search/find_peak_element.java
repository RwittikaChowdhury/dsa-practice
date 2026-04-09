// Problem: Find Peak Element
// Platform: LeetCode
// Link: https://leetcode.com/problems/find-peak-element/submissions/995971888/
// Pattern: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Status: Solved in Java (2023), Added to GitHub (2026)

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than next, peak is on left side (including mid)
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } 
            // Else peak is on right side
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}

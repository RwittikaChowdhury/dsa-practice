// Problem: Power of Two
// Platform: LeetCode
// Link: https://leetcode.com/problems/power-of-two/submissions/1973444852/
// Pattern: Bit Manipulation
// Time Complexity: O(1)
// Space Complexity: O(1)
// Status: Solved in Java (2023), Optimized & Added to GitHub (2026)

class Solution {
    public boolean isPowerOfTwo(int n) {
        // n must be positive and have only one set bit
        return n > 0 && (n & (n - 1)) == 0;
    }
}

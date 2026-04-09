// Problem: Pow(x, n)
// Platform: LeetCode
// Link: https://leetcode.com/problems/powx-n/submissions/995981926/
// Pattern: Binary Exponentiation (Divide & Conquer)
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Status: Solved in Java (2023), Optimized & Added to GitHub (2026)

class Solution {
    public double myPow(double x, int n) {

        long exp = n; // use long to handle Integer.MIN_VALUE safely

        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double result = 1.0;

        while (exp > 0) {
            // If exponent is odd → multiply result
            if ((exp % 2) == 1) {
                result *= x;
            }

            // Square the base
            x *= x;

            // Divide exponent by 2
            exp /= 2;
        }

        return result;
    }
}

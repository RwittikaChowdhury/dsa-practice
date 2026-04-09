// Problem: Roman to Integer
// Platform: LeetCode
// Link: https://leetcode.com/problems/roman-to-integer/submissions/995148840/
// Pattern: String Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)
// Status: Solved in Java (2023), Added to GitHub (2026)

class Solution {

    // Helper function to get value of Roman character
    public int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int current = getValue(s.charAt(i));

            // If next value is greater → subtract
            if (i + 1 < n && current < getValue(s.charAt(i + 1))) {
                sum -= current;
            } else {
                sum += current;
            }
        }

        return sum;
    }
}

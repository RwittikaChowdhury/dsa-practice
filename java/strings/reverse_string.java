// Problem: Reverse String
// Platform: LeetCode
// Link: https://leetcode.com/problems/reverse-string/
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)
// Status: Solved in Java (2023), Added to GitHub (2026)

class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        // Swap characters from both ends
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}

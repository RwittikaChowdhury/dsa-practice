// Problem: Valid Anagram
// Platform: LeetCode
// Link: https://leetcode.com/problems/valid-anagram/submissions/994919276/
// Pattern: Hashing (Frequency Count)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Status: Solved in Java (2023), Added to GitHub (2026)

class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ → cannot be anagram
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Count characters
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

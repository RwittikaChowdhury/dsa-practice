# Problem: Valid Parentheses
# Platform: LeetCode
# Link: https://leetcode.com/problems/valid-parentheses/submissions/994245271/
# Pattern: Stack
# Time Complexity: O(n)
# Space Complexity: O(n)
# Status: Solved in Python, Added to GitHub (2026)

def isValid(s):
    # Mapping of closing to opening brackets
    brackets_map = {
        ')': '(',
        '}': '{',
        ']': '['
    }

    stack = []

    for char in s:
        # If opening bracket → push to stack
        if char in brackets_map.values():
            stack.append(char)

        # If closing bracket → check match
        elif char in brackets_map:
            if not stack:
                return False

            top = stack.pop()

            if brackets_map[char] != top:
                return False

    # If stack is empty → valid
    return len(stack) == 0

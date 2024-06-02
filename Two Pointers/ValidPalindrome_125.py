class Solution:
    def isPalindrome(self, s: str) -> bool:
        L, R = 0, len(s)-1
        while L < R:
            while L < R and not s[L].isalnum():
                L += 1
            while L < R and not s[R].isalnum():
                R -= 1
            if s[L].lower() != s[R].lower():
                return False
            L = L + 1
            R = R - 1    
        return True        


# Two Pointer technique
# Note the 2 inner while loops instead of 2 if statements for checking the condition

# In this version, the nested while loops ensure that L and R only point to alphanumeric characters before making any comparisons:

# The inner while loops ensure L and R skip over any non-alphanumeric characters and stop only when they find an alphanumeric character or when L is no longer less than R.
# After ensuring s[L] and s[R] are alphanumeric, the comparison s[L].lower() != s[R].lower() is made.
# This guarantees that the pointers L and R are properly positioned for each comparison, thus avoiding incorrect checks and false negatives.
# The condition L < R in the inner while loops prevents L or R from going out of bounds, ensuring the comparisons are valid.

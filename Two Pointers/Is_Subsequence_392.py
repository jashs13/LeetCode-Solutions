class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:

        # split() doesn't take an empty seperator, hence we can't use this to convert a string into array
        #s_arr = s.split('')

        #Instead use list comprehension - string is another type of iterable 
        #s_arr = [ch for ch in s]
        #t_arr = [ch for ch in t]
        # Converting the string into character array is not necessary since we can access string as s[index]. So it's a waste

        L_s, L_t = 0, 0
        size_s = len(s)
        size_t = len(t)

        # Iterate over string t
        while L_t < size_t and L_s < size_s:
            if s[L_s] == t[L_t]:
                L_s += 1
            L_t += 1

        # If L_s has reached the end of s, then s is a subsequence of t
        return L_s == size_s



'''
Explanation:
Initialize pointers: Two pointers L_s and L_t are initialized to 0. These will track the current index in strings s and t, respectively.
Iterate over t: The loop iterates over t using the L_t pointer.
If the current character in s (s[L_s]) matches the current character in t (t[L_t]), move the L_s pointer to the next character in s.
Always move the L_t pointer to the next character in t.
Check if s is a subsequence: After the loop, if L_s has reached the end of s (L_s == size_s), it means all characters in s were found in t in the correct order, so s is a subsequence of t.
'''
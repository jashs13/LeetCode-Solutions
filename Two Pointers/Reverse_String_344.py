class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        L, R = 0, len(s)-1
        while L<R:
            last_wannabe_first = s[R]
            first_wannabe_last = s[L]
            s[L] = last_wannabe_first
            s[R] = first_wannabe_last
            L += 1
            R -= 1


'''
 Editorial has recursion - which is also in-place
 In-place refers to an algorithm that transforms input using no auxillary data structure

class Solution:
    def reverseString(self, s):
        def helper(left, right):
            if left < right:
                s[left], s[right] = s[right], s[left]
                helper(left + 1, right - 1)

        helper(0, len(s) - 1)

        
Normal 2 pointer solution: check the l,r = 0,0 syntax:
        
class Solution:
    def reverseString(self, s):
        left, right = 0, len(s) - 1
        while left < right:
            s[left], s[right] = s[right], s[left]
            left, right = left + 1, right - 1

'''
# Java Solution 

# class Solution {
#     public int scoreOfString(String s) {
#         int score = 0;
#         for(int i=1; i<s.length();i++){
#             int first = s.charAt(i-1);
#             int second = s.charAt(i);
#             score += Math.abs(first - second); 
#         }
#         return score;
#     }
# }

# Note: Java has s.length for Strings
# s.charAt for accessing index



# Python Code
class Solution:
    def scoreOfString(self, s: str) -> int:
        score = 0
        for i in range(1,len(s)):
            score += abs(ord(s[i-1]) - ord(s[i]))
        return score






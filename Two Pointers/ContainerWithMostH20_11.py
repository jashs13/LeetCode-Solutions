class Solution:
    def maxArea(self, height: List[int]) -> int:
        # area is l*b
        # so 2 pointerss, using entire length of it
        L, R = 0, len(height)-1
        maxA = 0
        while L<R:
            # if height[L]<height[R]:
            #     l = height[L]
            # else:
            #     l = height[R]    
            
            # This is ternary operator in python which is right
            l = height[L] if height[L]<height[R] else height[R]
            b = R-L
            a = l * b
            maxA = max(a, maxA)
            
            # Only doing this, we will move away from possible combinatons with the higher height.
            # But moving the shorter line's pointer could turn out to be beneficial, as per the same argument, despite the reduction in the width
            # L += 1
            # R -= 1  

            # Corrected approach - move only the line which has shorter height of the two but keep the larger as is  
            if height[L]<height[R]:
                L += 1
            else:
                R -= 1    

        return maxA
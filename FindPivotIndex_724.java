// Time Complexity: O(n) beats 100% of solutions
// Done using logic of runnySum in the num array. 
// runnySum = Summing till that index
// After getting runnySum array, leftSum = nums[pivot - 1] and rightSum = nums[last] - nums[pivot] 
class Solution {
    public int pivotIndex(int[] nums) {
        //int[] runnSum = new int[nums.length]; 
        int size = nums.length;
        for(int i=1; i<size; i++){    
            nums[i] += nums[i-1];   
        }
        int leftSum, rightSum = 0;
        for(int i=0; i<size; i++){
            if(i==0){
                leftSum = 0;
                rightSum = nums[size-1] - nums[0];
            }else{
                leftSum = nums[i-1];
                rightSum = nums[size-1] - nums[i];
            }
            if(leftSum == rightSum){
                return i;
            }else{
                leftSum = 0;
                rightSum = 0;
            }   
        }
        return -1;
    }
}

// time complexity: O(n^2) which is accepted but it can be done in O(n) also. 
/* Less Efficient: Using leftSum and rightSum int variables
class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for(int ind=0;ind<nums.length;ind++){
            if (ind==0){
                leftSum = 0;
            }
            else{
                for(int j=0;j<ind;j++){
                    leftSum += nums[j]; 
                }
            }
            for(int k=ind+1;k<nums.length;k++){
                rightSum += nums[k];
            }
            if(rightSum == leftSum){
                return ind;
            }
            leftSum = 0;
            rightSum = 0;
        }
        return -1; 
    }
}
*/

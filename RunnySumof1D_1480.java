class Solution {
    public int[] runningSum(int[] nums) {
        int sum1 = 0;
        int[] runnysum = new int[nums.length]; 
        for(int i = 0; i<nums.length; i++){
            sum1 = sum1 + nums[i];
            runnysum[i] = sum1;
        }
        return runnysum;
    }
}

//Second method is easier if we just start with index1 
/*
 * class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length;i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
 */
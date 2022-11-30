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
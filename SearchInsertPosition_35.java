class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            // find the mid ele
            int mid = start + (end-start)/2; //if start and end are big values then it may exceed the int range
            
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid + 1;
            }
            else{
                // ele found
                return mid;
            }
        }
        return start;       // THIS IS THE DIFFERENCE BETWEEN BS AND INSERT BS
    }
}
// INSTEAD OF RETURNING -1, WE RETURN LEFT POINTER SINCE IF TARGET NOT FOUND THEN LEFT CROSSES RIGHT
// AFTER CROSSING, LEFT COMES TO RIGHT OF IT AND HENCE AT THAT INDEX, THE VALUE SHOULD BE INSERTED
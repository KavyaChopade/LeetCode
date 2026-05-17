class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        int prefSum=0;
        for(int num:nums){
            total+=num;
        }
        for(int pivot=0;pivot<nums.length;pivot++){
            int suffSum=total-prefSum-nums[pivot];
            if(suffSum==prefSum){
                return pivot;
            }
            prefSum+=nums[pivot];
        }
        return -1;
    }
}
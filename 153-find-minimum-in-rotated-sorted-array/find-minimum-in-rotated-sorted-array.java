class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(n==1){
                return nums[n-1];
            }
            if(mid==0){
                if(nums[mid]<nums[mid+1]){
                    return nums[mid];
                }
            }
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            else if(nums[right]>nums[mid]){
                right=mid-1;
                if(right==0){
                    return nums[right];
                }
            }
            else if(nums[right]<nums[mid]){
                left=mid+1;
                if(left==(n-1)){
                    return nums[left];
                }
            }
        }
        return -1;
    }
}
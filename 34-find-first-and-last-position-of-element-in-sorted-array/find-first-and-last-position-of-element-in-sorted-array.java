import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int left=binarySearch(nums,target,true);
        int right=binarySearch(nums,target,false);
        result[0]=left;
        result[1]=right;
        return result;
    }

    private int binarySearch(int[] nums, int target, boolean isSearchingLeft){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int idx=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                idx=mid;
                if(isSearchingLeft){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return idx;
    }
}
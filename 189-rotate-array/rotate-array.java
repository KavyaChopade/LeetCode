import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        // The below approach failed for k=54944
        // while(k>0){
        //     int temp=nums[n-1];
        //     for(int i=n-1;i>0;i--){
        //         nums[i]=nums[i-1];
        //     }
        //     nums[0]=temp;
        //     k--;
        // }

        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    private void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
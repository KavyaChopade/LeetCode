class Solution {
    public boolean check(int[] nums) {
        int cnt=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                cnt++;
            }
        }
        if(cnt==0){
            return true;
        }
        if(cnt>=2){
            return false;
        }
        if(nums[n-1]<=nums[0]){
            return true;
        }
        else{
            return false;
        }

        // for (int i = 0; i < n; i++) {
        //     if (nums[i] > nums[(i + 1) % n]) { 
        //         cnt++;
        //     }
        //     if (cnt > 1){
        //         return false;
        //     }
        // }
        // return true;
    }
}
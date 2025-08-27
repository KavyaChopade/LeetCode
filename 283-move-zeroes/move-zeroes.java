class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(n==1){
                break;
            }
            if(nums[i]==0){
                cnt++;
            }
            if(nums[i]!=0){
                nums[i-cnt]=nums[i];
                if(cnt!=0){
                    nums[i]=0;
                }
            }
        }
    }
}
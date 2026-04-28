class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int cur=0;
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;++i){
            if(i>=k && nums[i-k]>1){
                cur--;
                nums[i-k]-=2;
            }
            if(cur%2==nums[i]){
                if(i+k>n){
                    return -1;
                }
                nums[i]+=2;
                cur++;
                res++;
            }
        }
        return res;
    }
}
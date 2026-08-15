class Solution {
    public int longestSubsequence(int[] nums) {
        int total=0;
        int n=nums.length;
        boolean nonZero=false;
        for(int a:nums){
            nonZero|=a>0;
            total^=a;
        }
        if(!nonZero){
            return 0;
        }
        return total==0 ? n-1 : n;
    }
}
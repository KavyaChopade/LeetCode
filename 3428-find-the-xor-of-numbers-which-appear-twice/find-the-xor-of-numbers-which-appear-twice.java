class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n=nums.length;
        int result=0;
        int[] hash = new int[101];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
            if(hash[nums[i]]==2){
                result=result^nums[i];
            }
        }
        return result;
    }
}
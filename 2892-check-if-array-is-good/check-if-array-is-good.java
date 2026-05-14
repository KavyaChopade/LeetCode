class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int ans=0;
        for(int num:nums){
            if(num<1 || num>n-1){
                return false;
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1;i<n-2;i++){
            if(map.getOrDefault(i,0)!=1){
                return false;
            }
        }
        return map.getOrDefault(n-1,0)==2;
    }
}
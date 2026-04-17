class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=(int) 1e6;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                ans=Math.min(ans,i-map.get(nums[i]));
            }
            map.put(reverse(nums[i]),i);
        }
        return ans == (int) 1e6 ? -1 : ans;
    }

    private int reverse(int x){
        int res=0;
        while(x>0){
            res=res*10+x%10;
            x=x/10;
        }
        return res;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>(map.keySet());
        Collections.sort(arr,(a,b)->map.get(b)-map.get(a));
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}
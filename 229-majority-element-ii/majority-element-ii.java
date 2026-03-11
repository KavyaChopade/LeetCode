class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c=nums.length/3;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>c){
                arr.add(key);
            }
        }
        return arr;
    }
}
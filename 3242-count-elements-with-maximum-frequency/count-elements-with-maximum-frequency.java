class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        Integer[] freqs = freq.values().toArray(new Integer[0]);
        int max=0;
        for(int i=0;i<freqs.length;i++){
            if(freqs[i]>max){
                max=freqs[i];
            }
        }
        int total=0;
        for(int i=0;i<freqs.length;i++){
            if(freqs[i]==max){
                total+=max;
            }
        }
        return total;
    }
}
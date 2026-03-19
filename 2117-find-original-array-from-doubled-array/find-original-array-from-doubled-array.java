class Solution {
    public int[] findOriginalArray(int[] changed) {
        int[] varcar=new int[0];
        int n=changed.length;

        if(n%2!=0){
            return varcar;
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        int[] ans= new int[n/2];

        for(int i=0;i<n;i++){
            map.put(changed[i],map.getOrDefault(changed[i],0)+1);
        }

        int tmp=0;
        Arrays.sort(changed);

        for(int i:changed){
            if(map.get(i)<=0){
                continue;
            }
            if(map.getOrDefault(2*i,0)<=0){
                return varcar;
            }

            ans[tmp++]=i;
            map.put(i,map.get(i)-1);
            map.put(2*i,map.get(2*i)-1);
        }
        return ans;
    }
}
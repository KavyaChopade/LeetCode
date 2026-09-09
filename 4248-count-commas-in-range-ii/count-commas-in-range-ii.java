class Solution {
    public long countCommas(long n) {
        long start=1000;
        long ans=0;
        int comma=1;
        while(start<=n){
            long end=start*1000-1;
            long count=Math.min(n,end)-start+1;
            ans=ans+count*comma;
            start=start*1000;
            comma++;
        }
        return ans;
    }
}
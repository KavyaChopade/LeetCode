class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int i=4,lnum=3,slnum=2,sum=0;
        while(i<=n){
            sum=lnum+slnum;
            slnum=lnum;
            lnum=sum;
            i++;
        }
        return sum;
    }
}
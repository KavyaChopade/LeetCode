class Solution {
    public int reverse(int x) {
        long revnum=0;
        int sign=1;
        if(x<0){
            sign=-1;
            x=-x;
        }
        while(x>0){
            int lastdig=x%10;
            x=x/10;
            revnum=(revnum*10)+lastdig;
        }
        if (revnum > Integer.MAX_VALUE) {
            return 0; 
        }
        return (int)revnum*sign;
    }
}
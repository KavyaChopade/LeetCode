class Solution {
    public boolean stoneGameIX(int[] stones) {
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        for(int val:stones){
            int type=val%3;
            if(type==0){
                ++cnt1;
            }
            else if(type==1){
                ++cnt2;
            }
            else{
                ++cnt3;
            }
        }
        if(cnt1%2==0){
            return cnt2>=1 && cnt3>=1;
        }
        return cnt2-cnt3>2 || cnt3-cnt2>2;
    }
}
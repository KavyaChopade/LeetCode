class Solution {
    public int reachNumber(int target) {
        int step=0;
        int dis=0;
        target =Math.abs(target);
        while(dis<target || ((target-dis)%2)!=0){
            step++;
            dis+=step;
        }
        return step;
    }
}
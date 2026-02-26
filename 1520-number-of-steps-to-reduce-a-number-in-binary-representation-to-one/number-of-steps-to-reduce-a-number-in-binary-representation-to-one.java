class Solution {
    public int numSteps(String s) {
        int step=0;
        int carry=0;
        for(int i=s.length()-1;i>0;i--){
            int bits=s.charAt(i)-'0';
            bits+=carry;
            if(bits%2==0){
                bits/=2;
                step+=1;
            }
            else if(bits%2==1){
                bits+=1;
                step+=2;
                carry=1;
            }
        }
        return step+carry;
    }
}
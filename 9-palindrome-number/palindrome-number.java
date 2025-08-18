class Solution {
    public boolean isPalindrome(int x) {
        int revnum=0;
        int n=x;
        while(x>0){
            int lastdig=x%10;
            x=x/10;
            revnum=(revnum*10)+lastdig;
        }

        if(n==revnum){
            return true;
        }
        else{
            return false;
        }
    }
}
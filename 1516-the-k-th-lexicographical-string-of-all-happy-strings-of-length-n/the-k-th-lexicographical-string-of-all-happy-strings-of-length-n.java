class Solution {
    int count=0;
    String ans="";

    public String getHappyString(int n, int k) {
        backtrack(n,k,"");
        return ans;
    }

    private void backtrack(int n, int k, String curr){

        if(curr.length()==n){
            count++;
            if(count==k){
                ans=curr;
            }
            return;
        }

        for(char ch:new char[]{'a','b','c'}){
            if(curr.length()==0 || curr.charAt(curr.length()-1)!=ch){
                backtrack(n,k,curr+ch);
            }
        }
    }
}
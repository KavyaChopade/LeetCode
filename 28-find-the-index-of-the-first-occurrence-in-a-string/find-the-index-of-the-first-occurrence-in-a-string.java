class Solution {
    public int strStr(String haystack, String needle) {
        String h=haystack;
        String n=needle;
        if(n.length()==0){
            return 0;
        }
        for(int i=0;i<=h.length()-n.length();i++){
            int j=0;
            while(j<n.length() && h.charAt(i+j)==n.charAt(j)){
                j++;
            }
            if(j==n.length()){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public int compress(char[] chars) {
        int ans=0;
        for(int i=0;i<chars.length;){
            final char letter=chars[i];
            int cnt=0;
            while(i<chars.length && chars[i]==letter){
                ++cnt;
                ++i;
            }
            chars[ans++]=letter;
            if(cnt>1){
                for(final char c:String.valueOf(cnt).toCharArray()){
                    chars[ans++]=c;
                }
            }
        }
        return ans;
    }
}
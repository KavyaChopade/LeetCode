class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;

        while(left<right){
            if(!isVowel(ch[left])){
                left++;
                continue;
            }
            if(!isVowel(ch[right])){
                right--;
                continue;
            }
            char tmp=ch[left];
            ch[left]=ch[right];
            ch[right]=tmp;
            left++;
            right--;
        }
        return String.valueOf(ch);
    }
    private boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;
    }
}
class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] s1Even=new int[26];
        int[] s1Odd=new int[26];
        int[] s2Even=new int[26];
        int[] s2Odd=new int[26];

        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                s1Even[s1.charAt(i)-'a']++;
                s2Even[s2.charAt(i)-'a']++;
            }
            else{
                s1Odd[s1.charAt(i)-'a']++;
                s2Odd[s2.charAt(i)-'a']++;
            }
        }
        return Arrays.equals(s1Even,s2Even) && Arrays.equals(s1Odd,s2Odd);
    }
}
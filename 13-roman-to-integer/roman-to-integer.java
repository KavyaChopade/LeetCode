class Solution {
    public int romanToInt(String s) {
        int res=0;
        Map<Character,Integer> romanVal=new HashMap<>();

        romanVal.put('I',1);
        romanVal.put('V',5);
        romanVal.put('X',10);
        romanVal.put('L',50);
        romanVal.put('C',100);
        romanVal.put('D',500);
        romanVal.put('M',1000);

        for(int i=0;i<s.length()-1;i++){
            if(romanVal.get(s.charAt(i))<romanVal.get(s.charAt(i+1))){
                res-=romanVal.get(s.charAt(i));
            }
            else{
                res+=romanVal.get(s.charAt(i));
            }
        }
        return res+romanVal.get(s.charAt(s.length()-1));
    }
}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        char[] arr=p.toCharArray();
        Arrays.sort(arr);
        int left=0;
        for(int i=0;i<=s.length();i++){
            char[] str=s.substring(left,i).toCharArray();
            Arrays.sort(str);
            if(Arrays.equals(str,arr)){
                res.add(left);
            }
            while(i-left+1 > p.length()){
                left++;
            }
        }
        return res;
    }
}
class Solution {
    public int numSpecialEquivGroups(String[] words) {
        Set<String> set=new HashSet<>();
        for(String s:words){
            int[] map1=new int[256];
            int[] map2=new int[256];

            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    map1[s.charAt(i)]++;
                }
                else{
                    map2[s.charAt(i)]++;
                }
            }
            set.add(Arrays.toString(map1)+" "+Arrays.toString(map2));
        }
        return set.size();
    }
}
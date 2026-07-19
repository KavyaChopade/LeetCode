class Solution {
    public String smallestSubsequence(String s) {
        int[] last=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        Stack<Character> st=new Stack<>();
        boolean[] visited=new boolean[26];
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(visited[curr-'a']){
                continue;
            }
            while(!st.isEmpty() && st.peek()>curr && last[st.peek()-'a']>i){
                visited[st.pop()-'a']=false;
            }
            st.push(curr);
            visited[curr-'a']=true;
        }
        StringBuilder ans=new StringBuilder();
        for(char c:st){
            ans.append(c);
        }
        return ans.toString();
    }
}
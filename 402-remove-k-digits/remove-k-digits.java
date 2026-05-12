class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(char ch:num.toCharArray()){
            while(k>0 && !st.isEmpty() && st.peek()>ch){
                st.pop();
                k--;
            }
            if(st.isEmpty() && ch=='0'){
                continue;
            }
            st.push(ch);
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            return "0";
        }

        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}
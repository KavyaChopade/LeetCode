class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            if (curr > 0) {
                st.push(curr);
            }
            else {
                boolean destroyed = false;
                while (!st.isEmpty() && st.peek() > 0) {
                    if (st.peek() < Math.abs(curr)) {
                        st.pop();
                    }
                    else if (st.peek() == Math.abs(curr)) {
                        st.pop();
                        destroyed = true;
                        break;
                    }
                    else {
                        destroyed = true;
                        break;
                    }
                }
                if (!destroyed) {
                    st.push(curr);
                }
            }
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
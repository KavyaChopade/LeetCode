class Solution {
    public int minimumPushes(String word) {
        int q=word.length() >> 3;
        int a=word.length() & 7;
        return ((q<<2)+a)*(q+1);
    }
}
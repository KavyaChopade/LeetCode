import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> m = new ArrayList<Integer>();
        for(int i:nums1){
            m.add(i);
        }
        for(int j:nums2){
            m.add(j);
        }
        Collections.sort(m);
        int a=m.size();
        if(a%2==0){
            return (m.get(a/2)+m.get((a/2)-1))/2.0;
        }
        else{
            return m.get(a/2);
        }
    }
}
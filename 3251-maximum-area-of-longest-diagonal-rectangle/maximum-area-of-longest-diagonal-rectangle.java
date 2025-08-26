class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag=0;
        int maxArea=0;
        int n=dimensions.length;

        for(int i=0;i<n;i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            int currDiag=(l*l + w*w);
            if(currDiag>maxDiag || (currDiag==maxDiag && maxArea<l*w)){
                maxDiag=currDiag;
                maxArea=l*w;
            }
        }
        return maxArea;
    }
}
// Last updated: 1/26/2026, 4:32:41 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for(int j=0;j<mat[i].length;j++){
                if(i==j || ((i+j)==mat.length-1)){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;       
    }
}
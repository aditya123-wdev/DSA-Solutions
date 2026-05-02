class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] outputArr = new int[r][c];
        int row=0, col=0;

        if(r*c != mat.length*mat[0].length){ return mat; }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(col<c){
                    outputArr[row][col++]= mat[i][j];
                } else{
                     col=0;
                     row++;
                     outputArr[row][col++]= mat[i][j];  
                }
            }
        }
        return outputArr;
    }
}

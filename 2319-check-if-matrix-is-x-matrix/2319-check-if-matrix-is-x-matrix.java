class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int rowLen=grid.length;
        int colLen=grid.length;
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if((i==j) || ((i+j)==rowLen-1)){
                    if(grid[i][j]==0){
                        return false;
                    }
                }
                else{
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
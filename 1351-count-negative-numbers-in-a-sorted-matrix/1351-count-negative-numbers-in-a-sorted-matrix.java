class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int rowLen=grid.length-1;
        int colLen=grid[0].length-1;
        for(int i=rowLen;i>=0;i--){
            for(int j=colLen;j>=0;j--){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}
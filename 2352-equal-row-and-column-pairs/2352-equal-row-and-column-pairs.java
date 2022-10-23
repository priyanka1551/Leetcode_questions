class Solution {
    public boolean sameRow(int x,int y,int[][] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[x][i]!=arr[i][y]){
                return false;
            }
        }
        return true;
    }
    public int equalPairs(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(sameRow(i,j,grid)){
                    count++;
                }
            }
        }
        return count;
    }
}
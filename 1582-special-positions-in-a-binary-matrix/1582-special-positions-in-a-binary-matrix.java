class Solution {
    public boolean specialPos(int[][] mat,int x,int y){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length ;j++){
                if(((y!=j) && (mat[x][j]==1)) || ((mat[i][y]==1) &&(x!=i))){
                    return false;
                }
            }
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    if(specialPos(mat,i,j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
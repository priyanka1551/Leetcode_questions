class Solution {
       public int minimumRow(int[][] matrix,int x){
          int minRow=matrix[x][0];
           for(int j=1;j<matrix[x].length;j++){
                if(matrix[x][j]<minRow){
                    minRow=matrix[x][j];
                }
            }
        return minRow;
        }
        public int maximumCol(int[][] matrix,int y){
          int maxCol=matrix[0][y];
            for(int j=1;j<matrix.length;j++){
                if(matrix[j][y]>maxCol){
                    maxCol=matrix[j][y];
                }
            }
          return maxCol;
        }
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ls=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==minimumRow(matrix,i) && matrix[i][j]==maximumCol(matrix,j)){
                    ls.add(matrix[i][j]);
                }
            }
        }
        return ls;
    }
}
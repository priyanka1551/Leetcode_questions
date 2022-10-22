class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<Integer>();
        HashSet<Integer> col=new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                     row.add(i);
                     col.add(j);
                }
            }
        }  
        for(Integer ele:row){    
            for(int i=0;i<matrix[0].length;i++){
                matrix[ele][i]=0;
            }
        }
    
        for(Integer inti:col){    
            for(int j=0;j<matrix.length;j++){
                matrix[j][inti]=0;
            }
        }    
    }
}
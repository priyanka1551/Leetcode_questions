class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        HashSet<Integer> hs1;
        HashSet<Integer> hs2;
        for(int i=0;i<n;i++){
            hs1=new HashSet<Integer>();
            for(int j=0;j<n;j++){
                if(hs1.contains(matrix[i][j])){
                    return false;
                }
                else{
                    hs1.add(matrix[i][j]);
                }
            }
        }
         for(int i=0;i<n;i++){
            hs2=new HashSet<Integer>();
            for(int j=0;j<n;j++){
                if(hs2.contains(matrix[j][i])){
                    return false;
                }
                else{
                    hs2.add(matrix[j][i]);
                }
            }
        }
        return true;    
    }
}

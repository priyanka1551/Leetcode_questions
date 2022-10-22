class Solution {
    public static boolean valid(int l,int m){
        if(l>=0 && l<m){
            return true;
        }
        return false;
    }
    public static int sumFunc(int row,int col,int kDup,int[][] arr){
        int i=row;
        int j=col;
        int sum=0;
        for(int r=i-kDup;r<=i+kDup;r++){
            for(int c=j-kDup;c<=j+kDup;c++){
                if(valid(r,arr.length) && valid(c,arr[0].length)){
                    sum+=arr[r][c];
                }
            }
        }
        return sum;
    }
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] res=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                res[i][j]=sumFunc(i,j,k,mat);
            }
        }
        return res;
    }
}
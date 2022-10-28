class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] arr=new int[matrix.length*matrix[0].length];
        int k=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[k]=matrix[i][j];
                k++;
            }
        }
        if(Arrays.binarySearch(arr,target)>=0){
            return true;
        }
        return false;
    }
}
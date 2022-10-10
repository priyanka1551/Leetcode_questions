class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] array=new int[rows*cols][2];
        int[] arr=new int[rows*cols];
        int d,k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){ 
                array[k][0]=i;
                array[k][1]=j;
                d=Math.abs(rCenter-i)+Math.abs(cCenter-j);
                arr[k]=d;
                k++;
            }
        }
        int len=arr.length;
        int temp1;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp1=arr[j+1];
                    int b=array[j+1][0];
                    int c=array[j+1][1];
                    arr[j+1]=arr[j];
                    array[j+1][0]=array[j][0];
                    array[j+1][1]=array[j][1];
                    arr[j]=temp1;
                    array[j][0]=b;
                    array[j][1]=c;
                }
            }
        }
        return array;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int count,temp,temp2;
        int r=mat.length;
        int[] arr=new int[r];
        int[] srt=new int[r];
        for(int i=0;i<r;i++){
            srt[i]=i;
        }
        for(int i=0;i<mat.length;i++){
            count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            } 
            arr[i]=count;
        }
        for(int i=0;i<r-1;i++){
            for(int j=0;j<r-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp=arr[j];
                    temp2=srt[j];
                    arr[j]=arr[j+1];
                    srt[j]=srt[j+1];
                    arr[j+1]=temp;
                    srt[j+1]=temp2;
                }
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=srt[i];
        }
        return res;
    }
    
}
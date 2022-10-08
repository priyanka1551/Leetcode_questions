class Solution {
    public void duplicateZeros(int[] arr) {
     
        int len=arr.length;
        int[] result=new int[len];
        int j=0;
        for(int i=0;i<arr.length && j<result.length ;i++){
            if(arr[i]!=0){
                result[j]=arr[i];
            }else{
                j++;
            }
            j++;
        }
        for(int k=0;k<result.length;k++){
            arr[k]=result[k];
        }
    }
}
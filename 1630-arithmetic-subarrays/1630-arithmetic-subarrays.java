class Solution {
    public boolean queryFunc(int[] arr,int m,int n){
        int k=0;
        int [] newArr=new int[n-m+1];
        for(int j=m;j<=n;j++){
            newArr[k]=arr[j];
            k++;
        }
        for(int l=0;l<newArr.length-1;l++){
            Arrays.sort(newArr);
            if((newArr[l+1]-newArr[l])!=(newArr[1]-newArr[0])){
                return false;
            }
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> answer=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int x=l[i];
            int y=r[i];
            boolean check=queryFunc(nums,x,y);
            answer.add(check);
        }
        return answer;
    }
}
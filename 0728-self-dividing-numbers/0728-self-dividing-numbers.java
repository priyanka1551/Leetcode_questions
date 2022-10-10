class Solution {
    public boolean checkDiv(int num){
        int n=num;
        int r;
        if(n==0){
            return false;
        }
        if(num<10){
            return true;
        }
        while(n!=0){
            r=n%10;
            if(r==0){
                return false;
            }
            if(num%r!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls=new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            if(checkDiv(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}
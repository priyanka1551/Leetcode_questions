class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ls=new ArrayList<String>();
        String st;
        for(int i=0;i<n;i++){
            if((i+1)%3==0 && (i+1)%5==0){
                st="FizzBuzz";
            }
            else if((i+1)% 3 ==0){
                st="Fizz";
            }
            else if((i+1)% 5==0){
                st="Buzz";
            }
            else{
                st=Integer.toString(i+1);         
            }
            ls.add(st);
        }
        return ls;
    }
}
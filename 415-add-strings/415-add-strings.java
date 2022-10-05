class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder num3=new StringBuilder();
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0 && j>=0){
                 sum+=(num1.charAt(i)-'0')+(num2.charAt(j)-'0');
            }
            else if(i>=0){
                 sum+=(num1.charAt(i)-'0');
            }
            else if(j>=0){
                sum+=(num2.charAt(j)-'0');
            }
            if(sum>9){
                carry=1;
                sum=sum%10;
            }
            else{
                carry=0;
            }
            num3.append(sum);
            i--;
            j--;
        }
        if(carry==1){
            num3.append(1);
        }
        return num3.reverse().toString();
        
    }
}
class Solution {
    public String arrangeWords(String text) {
        int k=0;
        int idx=0;
        int cnt=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                cnt++;
            }
        }
        String[] arr=new String[cnt+1];
        int[] count=new int[cnt+1];
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                arr[idx]=text.substring(k,i);
                count[idx]=arr[idx].length();
                idx++;
                k=i+1;
            }
        }
        arr[idx]=text.substring(k,text.length());
        count[idx]=arr[idx].length();
        for(int i=0;i<count.length-1;i++){
            for(int j=0;j<count.length-1-i;j++){
                if(count[j+1]<count[j]){
                    int temp1=count[j+1];
                    String temp2=arr[j+1];
                    count[j+1]=count[j];
                    arr[j+1]=arr[j];
                    count[j]=temp1;
                    arr[j]=temp2;
                }
            }
        }
        String str2="";
        for(int l=0;l<arr.length;l++){
            str2+=arr[l];
            str2+=" ";
        }
        str2=str2.toLowerCase();
        String str3=str2.substring(0, 1).toUpperCase();
        str3+=str2.substring(1,str2.length());
        return str3.trim();
    }
}
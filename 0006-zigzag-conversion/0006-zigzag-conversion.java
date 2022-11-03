class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        HashMap<Integer,String> hm=new HashMap<>();
        boolean flag=true;
        int pos=0;
        for(int i=0;i<s.length();i++){
            if(pos==numRows){
                flag=false;
            }
            if(pos==1){
                flag=true;
            }
            if(flag==true){
                pos++;
            }
            else{
                pos--;
            }
            String str=hm.getOrDefault(pos,"")+s.charAt(i);
            hm.put(pos,str);
        }
        String ans="";
        for (Map.Entry<Integer,String> entry : hm.entrySet()){
            ans+=entry.getValue();
        }
        return ans;
    }
}
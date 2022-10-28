class Solution {
    public String reverseWords(String s) {
        int k=s.length();
        List<String> ls=new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                ls.add(s.substring(i+1,k));
                ls.add(" ");
                k=i;
            }
            
        }
        ls.add(s.substring(0,k));
        String res="";
        for(int j=0;j<ls.size();j++){
            res+=ls.get(j);
        }
        return res.replaceAll("\\s+"," ").trim();
    }
}
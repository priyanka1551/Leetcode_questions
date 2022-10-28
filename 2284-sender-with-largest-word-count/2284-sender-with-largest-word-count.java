class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> hm=new HashMap<>();
        int max=Integer.MIN_VALUE;
        String res="";
        for(int i=0;i<senders.length;i++){
            String[] str=messages[i].split(" ");
            int count=str.length;
            if(!hm.containsKey(senders[i])){
                hm.put(senders[i],count);
            }
            else{
                 hm.put(senders[i], hm.getOrDefault(senders[i],0)+count);
            }
            if(hm.get(senders[i])>max){
                max=hm.get(senders[i]);
                res=senders[i];
            }
            else if(hm.get(senders[i])==max && res.compareTo(senders[i])<0){
                res=senders[i];
            }
        }
        return res;
        
    }
}
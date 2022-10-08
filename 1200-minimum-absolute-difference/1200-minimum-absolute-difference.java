class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> list1=new ArrayList<Integer>();
        List<List<Integer>> list2=new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        for(int j=0;j<arr.length-1;j++){
            if(arr[j+1]-arr[j]==min){
                list1=Arrays.asList(arr[j],arr[j+1]);
                list2.add(list1);
            }
        }
        return list2;
    }
}
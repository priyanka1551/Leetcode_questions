class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int r=names.length;
        int temp1;
        String temp2;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<r-i-1;j++){
                if(heights[j+1]>heights[j]){
                    temp1=heights[j+1];
                    temp2=names[j+1];
                    heights[j+1]=heights[j];
                    names[j+1]=names[j];
                    heights[j]=temp1;
                    names[j]=temp2;
                }
            }
        }
        return names;
    }
}
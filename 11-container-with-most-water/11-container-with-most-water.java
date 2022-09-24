class Solution {
    public int maxArea(int[] height) {
       int sum=0,i=0,j=height.length-1;
       while (i<j){
	       sum=Math.max(sum,Math.min(height[i],height[j])*(j-i));
	       if(height[i]<height[j])
		      i++;
	       else
		      j--;
       }
       return sum; 
    }
}
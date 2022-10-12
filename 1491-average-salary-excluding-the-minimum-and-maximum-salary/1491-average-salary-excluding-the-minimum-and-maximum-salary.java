class Solution {
    public double average(int[] salary) {
        double sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<salary.length;i++){
            if(salary[i]<min){
                min=salary[i];
            }
            if(salary[i]>max){
                max=salary[i];
            }
        }
        for(int j=0;j<salary.length;j++){
            if(salary[j]!=min && salary[j]!=max){
                sum+=salary[j];
            }
        }
        double avg=sum/(salary.length-2);
        return avg;
    }
}
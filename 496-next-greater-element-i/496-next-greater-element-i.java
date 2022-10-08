class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int s;
        if(len1<len2){
            s=len1;
        }
        else{
            s=len2;
        }
        int k=0;
        int[] res=new int[s];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length-1;j++){
                if(nums1[i]==nums2[j]){
                    int m;
                    for(m=j+1;m<nums2.length;m++){
                        if(nums2[m]>nums2[j]){
                            res[k]=nums2[m];
                            break;
                        }
                    }
                    if(m==nums2.length){
                        res[k]=-1;
                    }
                }
            }
            if(nums1[i]==nums2[len2-1]){
                res[k]=-1;
            }
            k++;
        }
        return res;
    }
}
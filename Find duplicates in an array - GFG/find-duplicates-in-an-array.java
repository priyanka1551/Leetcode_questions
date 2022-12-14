//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int idx=arr[i]%n;
            arr[idx]+=n;
        }
        for(int j=0;j<n;j++){
            if((arr[j]/n)>=2){
                lst.add(j);
            }
        }
        if(lst.size()==0){
            lst.add(-1);
        }
        return lst;
    }
}

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int end=n-1;
		    for(int j=end;j>=0;j--){
		        System.out.print(arr[j]);
		        System.out.print(" ");
		    }
		    System.out.println("");
		    t--;
		}
	}
}
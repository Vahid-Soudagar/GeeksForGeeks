//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int arr[], int n, int key)  { 
        //code here.
        int sp = 0;
        int ep = n - 1;
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        
        while (sp < n && sp >= 0) {
            if (arr[sp] == key) {
                if (arr[ep] == key) {
                    ans[0] = sp;
                    ans[1] = ep;
                    return ans;
                }
                ep--;
            } else if (arr[ep] == key) {
                if (arr[sp] == key) {
                    ans[0] = sp;
                    ans[1] = ep;
                    return ans;
                }
                sp++;
            } else {
                sp++;
                ep--;
            }
        }
        
        return ans;
    }
}
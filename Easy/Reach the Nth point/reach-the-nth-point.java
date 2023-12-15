//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int mod = (int) (1e9 + 7);

    
    public int nthPoint(int n) {
        // Code here
        int t1 = 1;
        int t2 = 2;
        
        if (n == 1) return t1;
        else if (n == 2) return t2;
        else {
            for (int i=2;i<n;i++) {
                int t3 = t1 + t2;
                t1 = t2%mod;
                t2 = t3%mod;
            }
        }
        
        return t2;
    }
}
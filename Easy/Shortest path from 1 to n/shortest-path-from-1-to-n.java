//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minStep(n));
        }
    }
}
// } Driver Code Ends


class Solution{
    
    public int minStep(int n) {
        // code here
        return solve(n);
    }
    
    public int solve(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n % 3 == 0) {
            return 1 + solve(n/3);
        } else if ((n - 1) % 3 == 0) {
            return 2 + solve((n-1)/3);
        } else {
            return 3 + solve((n-2)/3);
        }
    }
}

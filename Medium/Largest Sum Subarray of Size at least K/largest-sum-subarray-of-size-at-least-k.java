//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            System.out.println(obj.maxSumWithK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long maxSumWithK(long arr[], long n, long k)
    {
        long sum = 0;
        long maxi = Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        maxi = Math.max(maxi,sum);
        int prev = 0;
        for(int i=(int)k;i<n;i++)
        {
            sum+=arr[i];
            prev+=arr[j++];
            maxi = Math.max(maxi,sum);
            if(prev<0)
            {
                sum-=prev;
                maxi = Math.max(maxi,sum);
                prev = 0;
            }
        }
        return  maxi;
    }
}
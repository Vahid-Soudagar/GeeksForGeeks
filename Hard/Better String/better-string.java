//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(str1, str2);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String betterString(String str1, String str2) {
        // Code here
        int n = distinctSubseqCount(str1);
        int m = distinctSubseqCount(str2);
        
        return n >= m ? str1 : str2;
    }
    
    public static int distinctSubseqCount(String s) {
        int n = s.length();
        
        // Array to store the count of distinct subsequences ending at each character
        int[] dp = new int[n + 1];
        
        // Empty subsequence has one occurrence
        dp[0] = 1;

        // Map to store the last position of each character in the string
        int[] last = new int[256];
        Arrays.fill(last, -1);

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            dp[i] = 2 * dp[i - 1];

            // If the current character has occurred before, subtract the count
            if (last[s.charAt(i - 1)] != -1) {
                dp[i] -= dp[last[s.charAt(i - 1)] - 1];
            }

            // Update the last position of the current character
            last[s.charAt(i - 1)] = i;
        }

        // Subtract 1 to exclude the empty subsequence
        return dp[n] - 1;
    }
}

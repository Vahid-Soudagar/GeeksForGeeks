//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String s) {
        // Code here 
        int zero = -1;
        int one = -1;
        int two = -1;
        
        int minlen = Integer.MAX_VALUE;
        
        for(int i = 0; i<s.length(); i++) {


            // keep track of current or closest characters found

            if(s.charAt(i)=='1') one = i;
            if(s.charAt(i)=='2') two = i;
            if(s.charAt(i)=='0') zero = i;


            // calculate length if all three found in the string

            // -1 equals we havent encountered that char 

            if((one != -1) && (two != -1) && (zero != -1)) {


                // find current length ( maxlen - minlen)
                int len = Math.max(zero, Math.max(one, two)) - Math.min(zero, Math.min(one, two)) + 1;


                // update min length

                minlen = Math.min(minlen, len);
            }
            
        }
        
        // if any one of the char not found return -1
        if((one == -1) || (two == -1) || (zero == -1)) return -1;
        return minlen;
    }
}

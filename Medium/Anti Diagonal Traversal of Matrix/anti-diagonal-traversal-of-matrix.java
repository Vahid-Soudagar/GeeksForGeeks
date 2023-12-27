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
            
            String input_line[] = br.readLine().trim().split("\\s+");
            int[][] matrix = new int[n][n];
            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; ++j) {
                    matrix[i][j] = Integer.parseInt(input_line[i * n + j]); 
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.antiDiagonalPattern(matrix);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        int N = matrix.length;
        // Code here
        int[] result = new int[N * N];
        int index = 0;

        // Traverse the top-left half of the matrix
        for (int k = 0; k < N; k++) {
            int i = 0;
            int j = k;
            while (j >= 0) {
                result[index++] = matrix[i][j];
                i++;
                j--;
            }
        }

        // Traverse the bottom-right half of the matrix
        for (int k = 1; k < N; k++) {
            int i = k;
            int j = N - 1;
            while (i < N) {
                result[index++] = matrix[i][j];
                i++;
                j--;
            }
        }

        return result;

    }
}
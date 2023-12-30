//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        Map.Entry<String, Integer> maxEntry = map.entrySet().stream().sorted((e1, e2)->{
            if(e1.getValue() > e2.getValue())   return -1;
            else if(e1.getValue() < e2.getValue())  return 1;
            
            return e1.getKey().compareTo(e2.getKey());
        }).findFirst().get();
        
        String[] sol = new String[2];
        sol[0] = maxEntry.getKey();
        sol[1] = String.valueOf(maxEntry.getValue());
        
        return sol;
    }
}


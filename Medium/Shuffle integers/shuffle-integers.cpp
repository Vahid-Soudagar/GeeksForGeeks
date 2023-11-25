//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	
	
	
	public:
	void shuffleArray(int arr[],int n)
	{
        // Your code goes here
        int maxi=0;
        for(int i=0;i<n;i++){
            maxi=max(arr[i],maxi);
        }
        maxi=maxi+10;
        int l=0;
        int r=n/2;
        for(int i=0;i<n;i++){
            if(i%2==0){
            arr[i]=(maxi*(arr[l]%maxi))+(arr[i]);
            l++;
        }
        else{
            arr[i]=(maxi*(arr[r]%maxi))+(arr[i]);
            r++;
        }
        }
         for(int i=0;i<n;i++){
            arr[i]/=maxi;
        }
        return;
    }
		
};

//{ Driver Code Starts.


int main() 
{
   
   
   	int t;
    cin >> t;
    while (t--)
    {
    	int n;
	    cin>>n;
	    int a[n] ;
	    for(int i=0;i<n;i++)
	    {
	        cin>>a[i];
	    }


       

        Solution ob;
        ob.shuffleArray(a, n);

		for (int i = 0; i < n; i++) 
			cout << a[i] << " ";
    
	
        
	    cout << "\n";
	     
    }
    return 0;
}
// } Driver Code Ends
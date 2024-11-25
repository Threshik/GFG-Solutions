//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int maxprod=Integer.MIN_VALUE;
        int prod=1;
        for(int i=0;i<n;i++)
        {
            prod*=arr[i];
            if(prod>maxprod)
            {
                maxprod=prod;
            }
            if(prod==0)
            prod=1;
        }
        prod=1;
        for(int i=n-1;i>=0;i--)
        {
            prod*=arr[i];
            if(prod>maxprod)
            {
                maxprod=prod;
            }
            if(prod==0)
            prod=1;
        }
        return maxprod;
    }
}
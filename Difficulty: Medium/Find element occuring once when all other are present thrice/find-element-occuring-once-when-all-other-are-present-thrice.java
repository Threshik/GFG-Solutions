//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.singleElement(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==1)
            ans=i;
        }
        return arr[ans];
    }
}
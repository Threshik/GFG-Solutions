//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            System.out.println(new Solution().minJumps(arr));
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr) {
        // your code here
        int jumps=0;
        int maxindx=0;
        int endindx=0;
        int n = arr.length;
        if(arr.length<=1)
        return 0;
        for(int i=0;i<n;i++)
        {
            //finding the max jumps frm that current i value
            maxindx=Math.max(maxindx,i+arr[i]);
            //if endindx==i then update end with max and incr the jumps
            if(endindx==i)
            {
                endindx=maxindx;
                jumps++;
            }
            //if endindx is greater than the length-1 then it reached the last index
            if(endindx>=arr.length-1)
            break;
        }
        //it cant move
        if(endindx<arr.length-1)
        return -1;
        return jumps;
    }
}
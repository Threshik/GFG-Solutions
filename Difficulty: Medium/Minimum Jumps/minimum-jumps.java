//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr, size));
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr, int n) {
        // your code here
        int jumps=0;
        int maxindx=0;
        int endindx=0;
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
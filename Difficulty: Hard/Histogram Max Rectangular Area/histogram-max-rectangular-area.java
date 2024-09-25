//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long[] arr = new long[(int)n];
            for (int i = 0; i < n; i++) arr[i] = Long.parseLong(inputLine[i]);
            System.out.println(new Solution().getMaxArea(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[]) {
        // your code here
        Stack<Integer> st = new Stack<>();
        int n = hist.length;
       
        long maxArea = 0;
        for (int i = 0; i < n; i++) {
            // Process while current element is smaller than the top of the stack
            while (!st.isEmpty() && hist[st.peek()] > hist[i]) {
                int ele = st.pop(); // The index of the bar being processed
                long height = hist[ele];  // Use long for height
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                long width = nse - pse - 1;
                maxArea = Math.max(maxArea, height * width);  // Area calculation as long
            }
            st.push(i);
        }

        // Process the remaining elements in the stack
        while (!st.isEmpty()) {
            int ele = st.pop();
            long height = hist[ele];  // Use long for height
            int nse = n;
            int pse = st.isEmpty() ? -1 : st.peek();
            long width = nse - pse - 1;
            maxArea = Math.max(maxArea, height * width);  // Area calculation as long
        }
        return maxArea;
    }
}

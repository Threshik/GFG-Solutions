//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        int n = arr.length;
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        long sum = 0;

        for (int num : arr) {
            if (!set.add(num)) { // If the number is already in the set, it's a duplicate
                result[0] = num; // Store the duplicate
            }
            sum += num; // Calculate the sum of the array elements
        }

        // Calculate the expected sum of numbers from 1 to n
       long expectedSum = (long) n * (n + 1) / 2;
        result[1] = (int)(expectedSum - (sum - result[0])); 

        return result;
    }
}
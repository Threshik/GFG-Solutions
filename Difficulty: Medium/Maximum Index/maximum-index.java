//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        while (t-- > 0) {
            String line = scanner.nextLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxIndexDiff(nums));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to find the maximum index difference.
    int maxIndexDiff(int[] a) {
        int n = a.length;

        // Step 1: Create two auxiliary arrays
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // Step 2: Fill leftMin array with the minimum value from the left up to each index
        leftMin[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(a[i], leftMin[i - 1]);
        }

        // Step 3: Fill rightMax array with the maximum value from the right up to each index
        rightMax[n - 1] = a[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(a[j], rightMax[j + 1]);
        }

        // Step 4: Traverse both arrays to find the maximum index difference
        int i = 0, j = 0, maxDiff = -1;
        while (i < n && j < n) {
            if (leftMin[i] <= rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }
}

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
        if(arr.get(i)<0) neg.add(arr.get(i));
        else pos.add(arr.get(i));
        }
        arr.clear();
        int i = 0, j = 0;
        while (i < pos.size() && j < neg.size()) {
            arr.add(pos.get(i++));  // Add one positive
            arr.add(neg.get(j++));  // Add one negative
        }
        
        // Add remaining positive numbers (if any)
        while (i < pos.size()) {
            arr.add(pos.get(i++));
        }
        
        // Add remaining negative numbers (if any)
        while (j < neg.size()) {
            arr.add(neg.get(j++));
        }
        
        
        
        
    }
}
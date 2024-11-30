//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); // first string
            String s2 = br.readLine(); // second string

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String a, String b) {

        // Your code here
        char[] c1 = a.toLowerCase().toCharArray();
        char[] c2 = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);
        int l1=a.length();
        int l2=b.length();
        if(l1==l2){
        return java.util.Arrays.equals(c1,c2);
        }
        return false;
    }
}
//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.toLower(s));
        }
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
    static String toLower(String s) {
        // code here
        char[] ch = s.toCharArray();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char c = ch[i];
            if(c>='A' && c<='Z')
            {
                char ele = (char)(c-'A'+'a');
                ch[i]=ele;
            }
        }
        String res = String.valueOf(ch);
        return res;
    }
}
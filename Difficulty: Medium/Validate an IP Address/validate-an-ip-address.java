//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        // Write your code here
        String[] s = str.split("\\.");
        if(s.length!=4)
        return false;
        else
        {
        for(int i=0;i<s.length;i++)
        {
            if(s[i].length()>1 && Integer.parseInt(s[i])<10)
            return false;
            if(s[i].length()!=0)
            {
                if(Integer.parseInt(s[i])<0 || Integer.parseInt(s[i])>255)
                {
                    return false;
                }
            }
            else
            return false;
            
        }
        }
        return true;
    }
}
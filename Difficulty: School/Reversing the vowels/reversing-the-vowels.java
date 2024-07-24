//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        // your code here
        int n = s.length();
        char[] ch = s.toCharArray();
        int l=0;
        int r=n-1;
        while(l<r)
        {
            while(l<r && ch[l]!='a' && ch[l]!='e' && ch[l]!='i' && ch[l]!='o' && ch[l]!='u')
            l++;
             while(l<r && ch[r]!='a' && ch[r]!='e' && ch[r]!='i' && ch[r]!='o' && ch[r]!='u')
            r--;
            if(l>=r)
            break;
            char temp = ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            
            l++;
            r--;
            
        }
        String res = String.valueOf(ch);
        return res;
    }
}
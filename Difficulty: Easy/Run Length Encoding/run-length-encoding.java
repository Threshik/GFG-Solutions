//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.encode(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String encode(String s) {
        // code here
        if(s==null || s.isEmpty())
        return "";
        int count=1;
        int n = s.length();
        StringBuilder str = new StringBuilder();
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                str.append(s.charAt(i-1)).append(count);
                count=1;
            }
            else
            count++;
        }
        str.append(s.charAt(n-1)).append(count);
        return str.toString();
    }
}
    
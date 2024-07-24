//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.to_upper(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String to_upper(String str) 
    { 
        // code here
        char[] ch = str.toCharArray();
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            char c = ch[i];
            if(c>='a' && c<='z')
            {
            char ele = (char)(c+'A'-'a');
            ch[i]=ele;
            }
        }
        String res = String.valueOf(ch);
        return res;
    }
} 
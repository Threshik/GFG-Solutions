//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int num=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='I')
            {
                num+=1;
            }
            else if(ch=='V')
            {
                num+=5;
                if(i>0 && str.charAt(i-1)=='I')
                num-=2;
            }
            else if(ch=='X')
            {
                num+=10;
                if(i>0 && str.charAt(i-1)=='I')
                num-=2;
            }
            else if(ch=='L')
            {
                num+=50;
                if(i>0 && str.charAt(i-1)=='X')
                num-=20;
            }
            else if(ch=='C')
            {
                num+=100;
                if(i>0 && str.charAt(i-1)=='X')
                num-=20;
            }
            else if(ch=='D')
            {
                num+=500;
                if(i>0 && str.charAt(i-1)=='C')
                num-=200;
            }
            else if(ch=='M')
            {
                num+=1000;
                if(i>0 && str.charAt(i-1)=='C')
                num-=200;
            }
        }
        return num;
    }
}
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxWater(int arr[]) {
        // code he
        int n = arr.length;
        int left=0;
        int right=n-1;
        int leftmax=0;
        int rightmax=0;
        int res=0;
        while(left<=right)
        {
            if(arr[left]<=arr[right])
            {
                if(arr[left]>=leftmax)
                {
                    leftmax=arr[left];
                }
                else
                {
                    res+=leftmax-arr[left];
                }
                left++;
            }
            else
            {
                if(arr[right]>=rightmax)
                {
                    rightmax=arr[right];
                }
                else
                {
                    res+=rightmax-arr[right];
                }
                right--;
            }
        }
        return res;
    } 
}

    

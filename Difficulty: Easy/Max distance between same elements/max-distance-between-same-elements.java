//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;


// } Driver Code Ends

class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        Map<Integer,Integer>hmp=new HashMap<>();
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(!hmp.containsKey(arr[i]))
            {
                hmp.put(arr[i],i);
            }
        }
        for(int i=0;i<n;i++)
        {
           int v=(int)Math.abs(i-hmp.get(arr[i]));
           max=(int)Math.max(max,v);
        }
        return max;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maxDistance(arr));
        }
        sc.close();
    }
}
// } Driver Code Ends
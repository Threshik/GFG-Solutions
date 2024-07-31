//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.duplicates(arr);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends





class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1] && !l.contains(arr[i]))
            {
                l.add(arr[i]);
            }
            
        }
        Collections.sort(l);
        if(l.size()==0)
        {
            l.add(-1);
        }
         return l;
    }
}

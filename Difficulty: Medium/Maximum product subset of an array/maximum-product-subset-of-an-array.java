//{ Driver Code Starts
import java.util.*;

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) list.add(sc.nextInt());

            Solution obj = new Solution();
            long ans = obj.findMaxProduct(list);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends




class Solution {
    public long findMaxProduct(List<Integer> arr) {
        // code here
        int n = arr.size();
        long zero=0,prod=1,neg=0,max=Integer.MIN_VALUE;
        if(n==1)
        return arr.get(0);
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==0)
            {
                zero++;
                continue;
            }
            if(arr.get(i)<0)
            {
                neg++;
                max=Math.max(arr.get(i),max);
            }
            prod=(prod*arr.get(i))%1000000007;
        }
        if(zero==n || (neg==1 && zero==n-1))
        return 0;
        if(neg%2!=0)
        return prod/max;
        else
        return prod;
        
    }
}
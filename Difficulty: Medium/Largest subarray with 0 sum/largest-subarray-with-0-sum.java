//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        //TC: O(n^2)
       /* int sum=0;
        int len=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==0)
                {
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;*/
        
        //Optimized code
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen=0;
        int k=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==k)
            maxlen= i+1;
            
            if(map.containsKey(sum-k))
            {
               maxlen=Math.max(maxlen,i-map.get(sum-k)); 
            }
            else if(!map.containsKey(sum-k))
            {
                map.put(sum,i);
            }
            
        }
        return maxlen;
    }
}
//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends




class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        int n = nums.size();
        List<Integer> list = new ArrayList<>();
        int candidate1=-1,candidate2=-1,count1=0,count2=0;
        for(int num:nums)
        {
            if(num==candidate1)
            count1++;
            else if(num==candidate2)
            count2++;
            else if(count1==0)
            {
                candidate1=num;
                count1=1;
            }
            else if(count2==0)
            {
                candidate2=num;
                count2=1;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        
       count1=0;
       count2=0;
       
       for(int nn:nums)
       {
           if(nn==candidate1)
           count1++;
           if(nn==candidate2)
           count2++;
       }
       
       if(count1>n/3)
       list.add(candidate1);
       if(count2>n/3)
       list.add(candidate2);
       
       if(list.isEmpty())
       list.add(-1);
       
       return list;
    }
}

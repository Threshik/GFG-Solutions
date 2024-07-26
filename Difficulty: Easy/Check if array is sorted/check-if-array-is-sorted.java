//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    static boolean sorted(List<Integer> arr,int index)
    {
        if(index==arr.size()-1)
        return true;
        return arr.get(index)<=arr.get(index+1) && sorted(arr,index+1);
    }
    public boolean arraySortedOrNot(List<Integer> arr) {
        // code here
        return sorted(arr,0);
    }
}

//{ Driver Code Starts.

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] numStrings = line.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String numString : numStrings) {
                nums.add(Integer.parseInt(numString));
            }
            Solution ob = new Solution();
            boolean ans = ob.arraySortedOrNot(nums);
            System.out.println(ans ? "true" : "false");
        }
        scanner.close();
    }
}
// } Driver Code Ends
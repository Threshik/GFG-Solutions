//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    void nextPermutation(int[] arr) {
        // code here
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        boolean isEnter = false;
        int n = arr.length;
        
        for(int i = n-1; i >= 0; i--){
            tm.put(arr[i],tm.getOrDefault(arr[i],0)+1);
            Integer key = tm.higherKey(arr[i]);
            if(key != null){
               isEnter = true;
               arr[i] = key; 
               copy(arr,tm,i+1,key,n);
               break;
            }
        }
        if(!isEnter){
            Arrays.sort(arr);
        }
    }
    void copy(int[] arr, TreeMap<Integer,Integer> tm, int i, int d, int n){
        Iterator<Integer> itr = tm.keySet().iterator();

        while (itr.hasNext() && i < n) {
            Integer key = itr.next();
            if(key != d){
                for(int j = 0; j < tm.get(key); j++){
                    arr[i] = key;
                    i++;
                }
            }
            else if(key == d && tm.get(key) > 1){
                for(int j = 0; j < tm.get(key)-1; j++){
                    arr[i] = key;
                    i++;
                }
            }
        }
    }
}



//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
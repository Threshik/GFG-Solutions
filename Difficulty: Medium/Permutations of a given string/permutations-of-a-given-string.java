//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public void find(ArrayList<Character> ds,boolean[] vis,HashSet<String> ans,String s)
    {
        int n =s.length();
        StringBuilder sb = new StringBuilder();
        if(ds.size()==n)
        {
            for(char ch:ds)
            {
                sb.append(ch);
            }
            ans.add(sb.toString());
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
            vis[i]=true;
            ds.add(s.charAt(i));
            find(ds,vis,ans,s);
            ds.remove(ds.size()-1);
            vis[i]=false;
            }
            
        }
    }
    public List<String> find_permutation(String S) {
        // Code here
        ArrayList<Character> ds = new ArrayList<>();
        HashSet<String> ans = new HashSet<>();
        int n = S.length();
        boolean[] vis = new boolean[n];
        find(ds,vis,ans,S);
        ArrayList<String> res=new ArrayList<>(ans);
        Collections.sort(res);
        return res;
        
        
    }
}
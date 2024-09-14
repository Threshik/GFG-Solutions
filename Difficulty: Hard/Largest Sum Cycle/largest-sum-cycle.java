//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int Edge[] = new int[N];
            for(int i = 0; i < N; i++)
                Edge[i] = sc.nextInt();
            Solution ob = new Solution();
            long ans = ob.largesSumCycle(N, Edge);
            out.println(ans);            
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    long sum=-1;
    public long largesSumCycle(int N, int Edge[]){
        
        boolean[] vis = new boolean[N];
        boolean[] revis = new boolean[N];
        for(int i=0;i<N;i++)
        checkCycle(i,Edge,vis,revis,new ArrayList<Integer>());
        return sum;
    }
    public void checkCycle(int i,int Edge[],boolean[] vis,boolean[] revis,ArrayList<Integer> adj)
    {
        if(i==-1)
        return;
        //if the cycle exists
        if(revis[i])
        {
            int index = adj.indexOf(i);
            
            if(index!=-1)
            {
                int s=0;
                for(int j=index;j<adj.size();j++)
                {
                s+=adj.get(j);
                }
                if(s>sum)
                sum=s;
              return;
            }
        }
        if(vis[i])
        return;
        vis[i]=true;
        revis[i]=true;
        adj.add(i);
        checkCycle(Edge[i],Edge,vis,revis,adj);
        revis[i]=false;
        adj.remove(adj.size()-1);
        return;
    }
}
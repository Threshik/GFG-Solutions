//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    static void dfs(int[][] mat,int n,int cx,int cy,boolean[][] vis,ArrayList<String> res,String str)
    {
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        char[] ch={'R','L','D','U'};
        if(cx==n-1 && cy==n-1)
        {
            res.add(str);
            return;
        }
        for(int i=0;i<4;i++)
        {
            int n1 = cx+dx[i];
            int n2 = cy+dy[i];
            if(n1>=0 && n1<n && n2>=0 && n2<n && mat[n1][n2]==1 && !vis[n1][n2])
            {
                vis[n1][n2]=true;
                str+=ch[i];
                dfs(mat,n,n1,n2,vis,res,str);
                str=str.substring(0,str.length()-1);
                vis[n1][n2]=false;
                
            }
        }
    }
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        ArrayList<String> res = new ArrayList<>();
        int n = mat.length;
        boolean[][] vis = new boolean[n][n];
        //if the start is 0 i.e blocked or if the last is 0 then no
        //path to reach from start to destination so return the empty res
        if(mat[0][0]==0 || mat[n-1][n-1]==0)
        return res;
        vis[0][0]=true;
        dfs(mat,n,0,0,vis,res,"");
        //backtracking
        //final ans is sorted
        Collections.sort(res);
        return res;
    }
}
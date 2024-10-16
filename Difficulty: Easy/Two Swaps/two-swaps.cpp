//{ Driver Code Starts

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    bool checkSorted(vector<int> &arr) {
        // code here.
          int cnt = 0;
        for(int i=0; i<2; i++)
        {
            int ele = i;
            for(int j=i; j<arr.size(); j++)
            {
                if(arr[ele] > arr[j])
                {
                    ele = j;
                }
            }
            swap(arr[i],arr[ele]);
            if(ele != i)
            {
                 cnt++;
            }
            
            if(cnt > 1)
            {
                break;
            }
        }
        if(cnt == 1)
        {
            return false;
        }
    
        for(int i=0; i<arr.size()-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
};

//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        string input;
        getline(cin, input);
        stringstream ss(input);
        int num;
        vector<int> arr;
        while (ss >> num)
            arr.push_back(num);

        Solution ob;
        bool ans = ob.checkSorted(arr);
        if (ans)
            cout << "true" << endl;
        else
            cout << "false" << endl;
    }
}

// } Driver Code Ends
//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
class Solution {
  public:
    void printTriangle(int n) {
        int odx = 1;
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                cout<<(" ");
            }
            for(int k=1;k<=odx;k++)
                cout<<"*";
            odx+=2;
            cout<<"\n";
        }
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;

        Solution ob;
        ob.printTriangle(n);
    }
    return 0;
}
// } Driver Code Ends
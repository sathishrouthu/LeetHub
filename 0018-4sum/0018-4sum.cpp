class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& arr, int target) {
        sort(arr.begin(),arr.end());
        int n = arr.size();
        vector<vector<int>> ans;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int k=j+1;
                int l = n-1;
                while(k<l){
                    long long sum = arr[i]+arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if(sum==target){
                        vector<int> v = { arr[i],arr[j],arr[k],arr[l] };
                        ans.push_back(v);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1]) l--;
                        
                    }
                    else if(sum < target)
                        k++;
                    else 
                        l--;   
                }
                while(j<n-1 && arr[j]==arr[j+1]) j++;
            }
            while(i<n-1 && arr[i]==arr[i+1]) i++;
        }
        return ans;
    }
};
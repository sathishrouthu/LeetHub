```
#include<vector>

void mergeTwoSortedArraysWithoutExtraSpace(vector<long long> &a, vector<long long> &b){
	// Write your code here.
	int left = a.size()-1;
	int right = 0;
	while(left>=0 && right <b.size()){
		if(a[left]>b[right]){
			swap(a[left],b[right]);
			left--;
			right++;
		}
		else
			break;
	}
	sort(a.begin(),a.end());
	sort(b.begin(),b.end());
}


```

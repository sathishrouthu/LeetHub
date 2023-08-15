class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        int n = arr.length;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
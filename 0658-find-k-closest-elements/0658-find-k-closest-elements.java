class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int closeness  = 0;
        int i = 0 ;
        int j = 0 ;
        while(j<k){
            closeness += Math.abs(x - arr[j]);
            j++;
        }
        int start = 0;
        int end = k-1;
        int minCloseness = closeness;
        while(j<arr.length){
            closeness += Math.abs(x - arr[j]);
            closeness -= Math.abs(x - arr[i]);
            i++;
            if(closeness < minCloseness){
                minCloseness = closeness;
                start = i;
                end = j;
            }
            j++;
        }
        List<Integer> result = new ArrayList<Integer>();
        for(int ind = start; ind<=end; ind++){
            result.add(arr[ind]);
        }
        return result;
    }
}
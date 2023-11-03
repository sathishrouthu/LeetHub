class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<String>();
        int currStreamNumber = 1;
        for(int currTargetNumber : target ){
            while(currStreamNumber < currTargetNumber){
                currStreamNumber++;
                ans.add("Push");
                ans.add("Pop");
            }
            ans.add("Push");
            currStreamNumber++;
        }
    return ans;
    }
}
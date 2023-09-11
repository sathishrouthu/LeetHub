class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        int maxi = groupSizes[0];
        for(int i:groupSizes) maxi = Math.max(maxi,i);
        for(int g = 1;g<=maxi;g++){
            List<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<groupSizes.length;i++){
                if(groupSizes[i]==g) list.add(i);
                if(list.size()==g){
                    ans.add(list);
                    list = new ArrayList<Integer>();
                }
            }
        }
        return ans;
    }
}
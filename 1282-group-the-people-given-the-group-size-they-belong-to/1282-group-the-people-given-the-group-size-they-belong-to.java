class Solution {
    // Use pen and paper
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i],new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
            if(map.get(groupSizes[i]).size()==groupSizes[i]){
                ans.add(map.get(groupSizes[i]));
                map.remove(groupSizes[i]);
            }
        }
        return ans;
    }
}
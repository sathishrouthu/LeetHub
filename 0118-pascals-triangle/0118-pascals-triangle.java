class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows>1) res.add(new ArrayList<>(Arrays.asList(1,1)));
        for(int i=2;i<numRows;i++){
            res.add(new ArrayList<>(Arrays.asList(1)));
            for(int j=1;j<i;j++){
                // System.out.println(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                res.get(i).add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }  
            res.get(i).add(1);
        }
        return res;
    }
}






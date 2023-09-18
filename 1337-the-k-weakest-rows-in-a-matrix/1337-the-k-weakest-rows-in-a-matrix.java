class Solution {
    int getSoldiers(int[][] mat, int row){
        int l=0;
        int h = mat[0].length-1;
        while(l<=h){
            int mid = (l+h)>>1;
            if(mat[row][mid]==1) l = mid+1;
            else h = mid-1;
        }
        return h;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,List<Integer>> mp = new HashMap<>();
        int soldiersCount[] = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int soldiers = getSoldiers(mat,i);
            soldiersCount[i] = soldiers;
            if(!mp.containsKey(soldiers)){
                 mp.put(soldiers,new ArrayList<Integer>());
            }
            mp.get(soldiers).add(i);
        }
        
        Arrays.sort(soldiersCount);
        int ind=0;
        int[] ans = new int[k];
        while(ind<k){
            int sc = soldiersCount[ind];
            int n = mp.get(sc).size();
            for(int i=0;i<n && ind<k ;i++){
                ans[ind] = mp.get(sc).get(i);
                ind++;
            }
        }
        return ans;
    }
}
class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int np = people.length;
        int nf = flowers.length;
        int[] sortedPeople = Arrays.copyOf(people,np);
        Arrays.sort(sortedPeople);
        Arrays.sort(flowers,(a,b) -> Arrays.compare(a,b));
        
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int i=0;
        for(int p=0;p<np;p++){
            while(i<nf && flowers[i][0]<=sortedPeople[p]){
                heap.add(flowers[i][1]);
                i++;
            }
            while(!heap.isEmpty() && heap.peek()<sortedPeople[p]) heap.remove();
            map.put(sortedPeople[p],heap.size());
        }
        int[] ans = new int[np];
        for(i=0;i<np;i++){
            ans[i] = map.get(people[i]);
        }
        return ans;
    }
}
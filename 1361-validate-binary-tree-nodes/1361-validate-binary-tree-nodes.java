class Solution {
    private int findRoot(int n, int[] leftChild, int[] rightChild){
        Set<Integer> children = new HashSet<>();
        
        for(int i : leftChild) 
            if(i!=-1)
                children.add(i);
        
        for(int i : rightChild) 
            if(i!=-1)
                children.add(i);
        
        for(int i=0;i<n;i++){
            if(!children.contains(i)) return i;
        }
        return -1; 
    }
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int root = findRoot(n,leftChild,rightChild);
        if(root==-1) return false;
        
        Set<Integer> seen = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        seen.add(root);
        stack.push(root);
        while(!stack.empty()){
            int node = stack.pop();
            int[] children = {leftChild[node],rightChild[node]};
            for(int child:children){
                if(child!=-1){
                    if(seen.contains(child)) return false;
                    
                    seen.add(child);
                    stack.push(child);
                }
            }
        }
        return seen.size()==n;
    }
}
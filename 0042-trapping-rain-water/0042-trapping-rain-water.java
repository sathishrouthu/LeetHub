class Solution {
    public int trap(int[] height) {
        int leftMax = 0,rightMax=0;
        int l=0,r=height.length-1;
        int water = 0;
        while(l<r){
            if(height[l]<=height[r]){   //we have a right max
                if(height[l]<leftMax){  // we have a left max
                    water += leftMax-height[l];
                }
                else{                   // we dont have left max
                    leftMax = height[l];
                }
                l++;
            }
            else{                       // we have left max for r
                if(height[r]<rightMax)  // we have a right max
                    water += rightMax-height[r];
                else                    // we dont have right max
                    rightMax = height[r];
                r--;
            }
        }
        return water;
        
    }
}
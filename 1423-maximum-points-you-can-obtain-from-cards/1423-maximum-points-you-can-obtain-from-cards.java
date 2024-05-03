class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int len = n-k;
        int totalSum = 0;
        for(int x : cardPoints) totalSum += x;
        int minSum = subArrayWithLeastSumGivenLength(cardPoints,len);
        return  totalSum - minSum;
    }
    int subArrayWithLeastSumGivenLength(int[] nums,int len){
        int i = 0;
        int j = 0;
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        for(;j<nums.length;j++){
            sum += nums[j];
            while((j-i+1) > len){
                sum -= nums[i++];
            }
            if((j-i+1)==len)
                minSum = Math.min(minSum,sum);
        }
        return minSum;
    }
}
class Solution {
    public int bestClosingTime(String customers) {
        int penalty = 0;
        int minPenalty = 0;
        int closingHour=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y') penalty--;
            else penalty++;
            if(penalty<minPenalty){
                closingHour = i+1;
                minPenalty = penalty;
            }
        }
        return closingHour;
    }
}
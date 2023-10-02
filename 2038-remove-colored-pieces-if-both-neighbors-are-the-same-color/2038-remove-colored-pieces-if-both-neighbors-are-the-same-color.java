class Solution {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();
        int alice=0,bob=0;
        int aliceCurr=0,bobCurr=0;
        for(int i=0;i<n;i++){
            if(colors.charAt(i)=='A'){
                bobCurr=0;
                aliceCurr++;
                if(aliceCurr>=3) alice++;
            }
            else{
                aliceCurr=0;
                bobCurr++;
                if(bobCurr>=3) bob++;
            }
        }
        return alice>bob;
    }
}